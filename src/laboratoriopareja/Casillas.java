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
    
    private String ruta;
    private ImageIcon imagen;
    private boolean voltear, encontrado;
    
    public Casillas(String ruta){
        this.ruta = ruta;
        voltear = false;
        encontrado = false;
        imagenCasilla();
    }
    
    private void imagenCasilla(){
        ImageIcon casillaImagen = new ImageIcon(ruta);
        imagen = new ImageIcon(casillaImagen.getImage().getScaledInstance(100, 100, SCALE_SMOOTH));
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
