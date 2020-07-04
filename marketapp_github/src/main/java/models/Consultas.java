
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Consultas extends ConexionBD{
    
    public boolean autenticacion(String usuario, String contraseña){
        PreparedStatement pst= null;
        ResultSet rs= null;
        
        try{
            String consulta="select * from tbl_usuarios where username=? and pass=?";
            pst= getConexionBD().prepareCall(consulta);
            pst.setString(1,usuario);
            pst.setString(2,contraseña);
            rs= pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        }catch(Exception e){
            System.err.println("Error: "+e);
        }finally{
            try{
                if(getConexionBD()!= null) getConexionBD().close();
                if(pst!=null) pst.close();
                if(rs!=null) rs.close();
            }catch (Exception e){
                System.err.println("Error: "+e);
            }
        }
        
        return false;
    }
    
    public boolean registrar (String nombre, String apellido, String usuario, String correo, String contraseña){
        
        PreparedStatement pst= null;
        
        try{
            String consulta= "insert into tbl_usuarios (nomb, ape, username, correo, pass) values(?,?,?,?,?)";
            pst= getConexionBD().prepareStatement(consulta);
            pst.setString(1,nombre);
            pst.setString(2,apellido);
            pst.setString(3,usuario);
            pst.setString(4,correo);
            pst.setString(5,contraseña);
            
            if(pst.executeUpdate()==1){
                return true;
            }
        }catch (Exception ex){
            System.err.println("Error:"+ex);
        }finally{
            try{
                if(getConexionBD()!=null) getConexionBD().close();
                if(pst !=null) pst.close();
            }catch (Exception e){
                System.err.println("Error"+e);
            }
        }
        return false;
    }
     
}
