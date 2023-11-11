/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

/**
 *
 * @author PROPIETARIO
 */
public class Constraseña {
    
     public String Mostrarcontraseña(String camaraId) {
        return " Escriba su contraseña " + camaraId ;
    }

    public String Ocultarcontraseña(String camaraId) {
        return "******** " + camaraId ;
    }
    public String Recuperarcontraseña(String camaraId) {
        return " Escriba su nueva contraseña " + camaraId;
    }
    
}

