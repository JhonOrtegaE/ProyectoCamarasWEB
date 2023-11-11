/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class SistemaMonitoreoCamara {
    private final List<Camara> camaras;

    public SistemaMonitoreoCamara() {
        camaras = new ArrayList<>();
    }

    public void addCamara(Camara camara) {
        camaras.add(camara);
    }

    public void removeCamara(String camaraId) {
        camaras.removeIf(camara -> camara.getId().equals(camaraId));
    }

    public List<Camara> getCamaras() {
        return camaras;
    }

    public byte[] viewCamaraImagen(String camaraId) {
        Optional<Camara> camaraOptional = camaras.stream().filter(camara -> camara.getId().equals(camaraId)).findFirst();
        if (camaraOptional.isPresent()) {
            return ("Imagen capturada desde la cámara " + camaraId).getBytes();
        } else {
            return null; // Cámara no encontrada
        }
    }
}

