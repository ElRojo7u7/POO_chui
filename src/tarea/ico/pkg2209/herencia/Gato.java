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
public class Gato extends Animal {
    private float peso;
    private float altura;
    private String raza;
    private String nombre;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" + "peso=" + peso + ", altura=" + altura + ", raza=" + raza + ", nombre=" + nombre + '}';
    }

    public Gato(float peso, float altura, String raza, String nombre, int numP, boolean p, boolean m) {
        super(numP, p, m);
        this.peso = peso;
        this.altura = altura;
        this.raza = raza;
        this.nombre = nombre;
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("Miauuuuuu jajaj soy un gato");
    }

    public Gato() {
        super();
        this.altura = (float) 0.2;
        this.nombre = "Michi";
        this.peso = 15;
        this.raza = "Bombay";
    }
    
    
}
