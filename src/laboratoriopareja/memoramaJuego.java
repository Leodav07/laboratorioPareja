/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriopareja;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author hnleo
 */
public class memoramaJuego {
   Random azar = new Random();
   private Casillas tabla[][];
   private int row, column;
   private JButton boton1, boton2;
   private Casillas casilla1, casilla2;
   private boolean esperarSeleccion;
   int contador = 10;
    public memoramaJuego(int filas, int columnas){
        
        row = filas;
        column = columnas;
        tabla = new Casillas[filas][columnas];
        esperarSeleccion = false;
        casillasAleatorias();
        System.out.println("Memorama iniciado: "+filas+ "x"+columnas);
        
        System.out.println("Intento: "+contador);
    }
    
    private void mezclar(Casillas[] arregloTem){
        
        for (int i = arregloTem.length -1; i > 0; i--) {
            int j = azar.nextInt(i+1);
            Casillas mezclado = arregloTem[i];
            arregloTem[i] = arregloTem[j];
            arregloTem[j] = mezclado;
        }
    }
    
    private void casillasAleatorias(){
        int id = 0;
        Casillas[] casillasTemporal = new Casillas[36];
        
        for (int i = 0; i < 18; i++) {
            String ruta = "/images/imagen_"+i+".png";
            casillasTemporal[i*2] = new Casillas(i, ruta);
            casillasTemporal[i*2+1]= new Casillas(i, ruta);
        }
        mezclar(casillasTemporal);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tabla[i][j] = casillasTemporal[id];
                id++;
            }
        }
        
    }
    
    public void seleccionDeCasilla(int fila, int columna, JButton button){
        System.out.println("Carta seleccionada: ["+fila+"]["+columna+"]");
        Casillas casilla = tabla[fila][columna];
        
        if(casilla.volteado() || casilla.encontrado()){
            return;
        }
        
        casilla.voltearCarta();
        mostrar(casilla, button);
        
        if(esperarSeleccion){
            boton2 = button;
            casilla2 = casilla;
            esperarSeleccion = false;
          Timer cooldown = new Timer(1000, e-> verificacion());
            cooldown.setRepeats(false);
            cooldown.start();
        }else{
            boton1 = button;
            casilla1 = casilla;
            esperarSeleccion = true;
        }
        
    }
    
    private void verificacion(){
        if(casilla1.getId() == casilla2.getId()){
            casilla1.cartaEncontrada();
            casilla2.cartaEncontrada();
            boton1.setBackground(Color.GREEN);
            boton2.setBackground(Color.GREEN);
            System.out.println("Intento: "+contador);
        }else{
            contador--;
            System.out.println("Intento: "+contador);
            casilla1.voltearRevesCarta();
            casilla2.voltearRevesCarta();
            ocultar(boton1);
            ocultar(boton2);
            System.out.println("Intento Fallido");
        }
        boton1 = null;
        boton2 = null;
        casilla1 = null;
        casilla2 = null;
    }
    
    private void mostrar(Casillas casilla, JButton button){
        if(casilla.getImagen() != null){
            button.setIcon(casilla.getImagen());
            button.setText("");
        }else{
            button.setText(String.valueOf(casilla.getId()));
        }
                
    }
    private void ocultar(JButton button){
        button.setIcon(null);
        button.setText("");
    }
    
    public boolean finalJuego(){
        if(contador<=0){
            return true;
        }
        return false;
    }
    
}
