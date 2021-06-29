/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.ico.pkg2209.herencia;

/**
 *
 * @author diego
 */
public class TareaIco2209Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        perro.emitirSonido();
        System.out.println(perro.toString());
        gato.emitirSonido();
        System.out.println(gato.toString());
    }
    
}
