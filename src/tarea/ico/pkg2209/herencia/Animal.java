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
public class Animal {
    private int numPatas;
    private boolean pelaje;
    private boolean mamifero;
    public Animal(int numP, boolean p, boolean m){
        this.numPatas = numP;
        this.pelaje = p;
        this.mamifero = m;
    }

    public void emitirSonido(){
        //overide method
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    @Override
    public String toString() {
        return "Animal{" + "numPatas=" + numPatas + ", pelaje=" + pelaje + ", mamifero=" + mamifero + '}';
    }

    public Animal() {
        this.mamifero = true;
        this.numPatas = 4;
        this.pelaje = true;
    }
    
}
