/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion.y.composicion;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Facultad {
    private String nombre;
    private HashMap<Integer,Estudiante>estudiantes;//clave y tipos de objeto que guarda

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.estudiantes=new HashMap<>();
        
    }
    public void AddEstudiante(Estudiante estudiante){
    this.estudiantes.put(estudiante.getCodigo(), estudiante);
    
    
    }

    public String getNombre() {
        return nombre;
    }
    
}
