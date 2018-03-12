/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerarraylist2;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class EjerArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Grupo g = new Grupo();
        ArrayList<String> a=new ArrayList<>();
        a.add("matematicas");
        a.add("lengua");
        a.add("ciencias");
        a.add("ingles");
        a.add("informatica");
        a.add("fisica");
        
        g.matricular("pepe",a);
        g.matricular("juan",a);
        g.matricular("maria",a);
        g.matricular("adri",a);
        
        g.ponerNotaAlumno("pepe", "fisica");
        System.out.println(g.obtenerMejorNota());
        g.borrarAlumnoGrupo("adri");
        System.out.println(g);
        
        
    }
    
}
