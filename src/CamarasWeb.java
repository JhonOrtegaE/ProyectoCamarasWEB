/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import Pantallas.Camarasweb.PantallaBienvenido;
import java.util.List;
import monitoreo.de.camaras.Camara;
import monitoreo.de.camaras.SistemaMonitoreoCamara;

/**
 *
 * @author USER
 */
public class CamarasWeb {

    public static void main(String[] args){

        PantallaBienvenido bienvenido = new PantallaBienvenido();
        bienvenido.setLocationRelativeTo(null);
        bienvenido.setVisible(true); 
        
        SistemaMonitoreoCamara sistemaMonitoreo = new SistemaMonitoreoCamara();

        // Agregar cámaras al sistema
        sistemaMonitoreo.addCamara(new Camara("cam001", "Entrada Principal"));
        sistemaMonitoreo.addCamara(new Camara("cam002", "Pasillo Interior"));
        

        // Acceder a la lista de cámaras
        List<Camara> camaras = sistemaMonitoreo.getCamaras();

        for (Camara camara : camaras) {
            System.out.println("Cámara ID: " + camara.getId());
            System.out.println("Ubicación: " + camara.getubicacion());
             
        }

        // Ver una imagen de una cámara específica
        String cameraIdToView = "cam001";
        byte[] image = sistemaMonitoreo.viewCamaraImagen(cameraIdToView);
        if (image != null) {
            System.out.println("Vista previa de la cámara " + cameraIdToView);
            // Aquí puedes mejorar la visualización de la imagen
            // En lugar de imprimir el array de bytes, considera convertirlo en una representación de imagen.
        } else {
            System.out.println("Cámara no encontrada");
        }
    }    
  
}
