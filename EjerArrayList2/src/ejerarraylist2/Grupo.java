/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerarraylist2;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;

/**
 * Clase grupo con un array de alumnos con getters , setters , constructor , to string y metodos 
 * @author alumno
 */
public class Grupo {
    private ArrayList<Alumnos> alumnos;

    public Grupo() {
        this.alumnos = new ArrayList<Alumnos>();
    }
    /**
     * 
     * @param nAlumno
     * @param nAsignaturas 
     */
    
    public void matricular(String nAlumno , ArrayList<String> nAsignaturas){
      ArrayList<Nota> asignaturas = new ArrayList<Nota>();
        for (int i = 0; i < nAsignaturas.size(); i++) {
            asignaturas.add(new Nota(nAsignaturas.get(i)));
        }
         Alumnos a = new Alumnos(nAlumno,asignaturas);
         alumnos.add(a);
    }

    @Override
    public String toString() {
        return "Grupo{" + "alumnos=" + alumnos + '}';
    }
    
    /**
     * 
     * @param nAlumno
     * @param asignatura
     * @return boolean
     */
    public boolean ponerNotaAlumno(String nAlumno , String asignatura){
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).getNombre().equalsIgnoreCase(nAlumno)){
                alumnos.get(i).ponerNota(asignatura);
                return true;
            }
        }
        return false;
    }
    /**
     * 
     * @param nAlumno
     * @return boolean
     */
    public boolean borrarAlumnoGrupo(String nAlumno){
        /*
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).getNombre().equalsIgnoreCase(nAlumno)){
                alumnos.remove(i);
                return true;
            }
        }
       */
        alumnos.removeIf((t) -> t.getNombre().equalsIgnoreCase(nAlumno));
         return false;
    }
    /**
     * corra todo el array
     */
    public void borrarTodos(){
       alumnos.clear(); 
    }
    /**
     * 
     * @return int
     */
    public int suspensos(){
        int suspensos=0;
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.get(i).getNotas().size(); j++) {
                if(alumnos.get(i).getNotas().get(j).getCalificacion()<5){
                    suspensos++;
                }
            }
        }
        return suspensos;
    }
    /**
     * 
     * @return Nota
     */
    public Nota obtenerMejorNota(){
        Nota mejorN=alumnos.get(0).getNotas().get(0);
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.get(i).getNotas().size(); j++) {
                if(alumnos.get(i).getNotas().get(j).getCalificacion()>mejorN.getCalificacion()){
                   mejorN=alumnos.get(i).getNotas().get(j);
                }
            }
        }
        return mejorN;
    }
    /**
     * 
     * @param nAlumno
     * @return boolean
     */
    public boolean estaGrupo(String nAlumno){
        /*
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).getNombre().equalsIgnoreCase(nAlumno)){
                return true;
            }
        }
        return false;
*/
        Iterator it = alumnos.iterator();
        Alumnos al;
        while(it.hasNext()){
           al=(Alumnos)it.next();
           if(al.getNombre().equalsIgnoreCase(nAlumno)){
               return true;
           }
        }
        return false;
    }
    
}
