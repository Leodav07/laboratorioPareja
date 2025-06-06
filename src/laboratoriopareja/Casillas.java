/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriopareja;
import javax.swing.*;
import java.awt.*;
import static java.awt.Image.*;
/**
 *
 * @author hnleo
 */
public class Casillas {
    private int id;
    private String ruta;
    private ImageIcon imagen;
    private boolean voltear, encontrado;
    
    public Casillas(int id,String ruta){
        this.id = id;
        this.ruta = ruta;
        voltear = false;
        encontrado = false;
        imagenCasilla();
    }
    
    private void imagenCasilla(){
        try {
            // Intentar cargar desde resources
            java.net.URL imgURL = getClass().getResource(ruta);
            if (imgURL != null) {
                imagen = new ImageIcon(imgURL);
            } else {
                // Intentar cargar desde archivo
                imagen = new ImageIcon(ruta);
                if (imagen.getIconWidth() == -1) {
                    System.out.println("No se pudo cargar la imagen: " + ruta);
                    imagen = null;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar imagen " + ruta + ": " + e.getMessage());
            imagen = null;
        }
    }
    public int getId(){
        return id;
    }
    public String getRuta(){
        return ruta;
    }
    public ImageIcon getImagen(){
        return imagen;
    }
    public boolean volteado(){
        return voltear;
    }
    public boolean encontrado(){
        return encontrado;
    }
    public void voltearCarta(){
        voltear = true;
    }
    public void voltearRevesCarta(){
        voltear = false;
    }
    public void cartaEncontrada(){
        encontrado = true;
    }
            
}
