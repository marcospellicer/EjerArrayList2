/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerarraylist2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Clase Alumnos con los atributos nombre y el array de 6 notas con getters , setters , constructor , to string y metodos 
 * @author alumno
 */
public class Alumnos {
    
    private String nombre;
    private ArrayList<Nota> notas;

    public Alumnos(String nombre, ArrayList<Nota> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    /**
     * recibe un nombre de asignatura , la busca y le asigna una nota , devuelve true si se realiza y false si no lo encuentra
     * @param asignatura
     * @return boolean
     */
    public boolean ponerNota(String asignatura){
        int nota=0;
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < notas.size(); i++) {
            if(notas.get(i).getModulo().equalsIgnoreCase(asignatura)){
                System.out.println("dime la nota");
                nota=a.nextInt();
                notas.get(i).setCalificacion(nota);
                return true;
            }
        }
        System.out.println("asignatura no encontrada");
       return false;
    }

    /**
     * recorre el array de notas buscando la mayor y devuelve un int con ella
     * @return int
     */
    public int mejorNota(){
        int mayor=0;
        for (int i = 0; i < notas.size(); i++) {
            if(notas.get(i).getCalificacion()>mayor){
                mayor=notas.get(i).getCalificacion();
            }
        }
        return mayor;
    }
    /**
     * recibe un nombre de asignatura , la busca y muestra su nota
     * @param asignatura
     * @return int
     */
     public int verNota(String asignatura){
        int nota=0;
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < notas.size(); i++) {
            if(notas.get(i).getModulo().equalsIgnoreCase(asignatura)){
               nota=notas.get(i).getCalificacion();    
        }
}
       return nota;
    
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the notas
     */
    public ArrayList<Nota> getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
   
    
}
