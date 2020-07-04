
package models;

import classes.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloProducto extends ConexionBD{
    
    public ArrayList<Producto> getAllProductos(){
        ArrayList<Producto> productos = new ArrayList<>();
        PreparedStatement pst= null;
        ResultSet rs=null;
        try{
            String sql= "call selectProductos()";
            pst= getConexionBD().prepareCall(sql);
            rs= pst.executeQuery();
            while(rs.next()){
                productos.add(new Producto(rs.getInt("id_producto"),rs.getString("nom_prod"),rs.getDouble("precio_prod"),rs.getInt("id_categ"),rs.getInt("id_marca"),rs.getInt("stock"),rs.getString("imagen"),rs.getString("descripcion")));
                
            }
        }catch (Exception e){
            
        }finally{
            try{
                if(rs != null) rs.close();
                if(pst !=null) pst.close();
                if(getConexionBD() != null) getConexionBD().close();
            }catch (Exception e){
                
            }
        }
        
        return productos;
    }
    
    public Producto getProducto(int id){
        Producto producto= null;
        PreparedStatement pst= null;
        ResultSet rs=null;
        try{
            String sql= "call selectProducto(?)";
            pst= getConexionBD().prepareCall(sql);
            pst.setInt(1, id);
            rs= pst.executeQuery();
            while(rs.next()){
                producto= new Producto(rs.getInt("id_producto"),rs.getString("nom_prod"),rs.getDouble("precio_prod"),rs.getInt("id_categ"),rs.getInt("id_marca"),rs.getInt("stock"),rs.getString("imagen"),rs.getString("descripcion"));
                
            }
        }catch (Exception e){
            
        }finally{
            try{
                if(rs != null) rs.close();
                if(pst !=null) pst.close();
                if(getConexionBD() != null) getConexionBD().close();
            }catch (Exception e){
                
            }
        }
        
        return producto;
    }
}
