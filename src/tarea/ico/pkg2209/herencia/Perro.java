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
public class Perro extends Animal {
    private String raza;
    private float altura;
    private float peso;
    private String nombre;

    /**
     *
     * @param raza
     * @param altura
     * @param peso
     */
    public Perro(String nombre, String raza, float altura, float peso, int numP, boolean p, boolean m) {
        super(numP, p, m);
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("woooof jsjsjsjsj soi un perro :U");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perro() {
        super();
        this.altura = (float) 0.7;
        this.nombre = "ElFirulais";
        this.peso = 50;
        this.raza = "Pitbull";
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", altura=" + altura + ", peso=" + peso + ", nombre=" + nombre + '}';
    }
    
}
