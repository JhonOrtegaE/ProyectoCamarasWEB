/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

public class Camara {
    private String id;
    private String ubicacion;

    public Camara(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public String getubicacion() {
        return ubicacion;
    }

    public String captureImage() {
        // Simulación de la captura de una imagen
        return "Imagen capturada desde la cámara " + id;
    }

}

