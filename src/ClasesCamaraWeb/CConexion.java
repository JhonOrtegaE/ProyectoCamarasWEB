/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesCamaraWeb;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author JHON ORTEGA ECHENIQUE
 */
public class CConexion {
    
    Connection conectar;
    
    String usuario= "root";
    String contraseña="";
    String bd="proyecto_camaras_web";
    String ip="127.0.0.1";
    String puerto="3306";
    
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection estableceConexion(){
    
          try {
              Class.forName("com.mysql.jdbc.Driver");
              conectar= DriverManager.setConnection(cadena,usuario,contraseña);
              JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de Datos");
              }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, "Problemas en la conexion" + e.toString());
               }
          return conectar;
    }
}
