/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaa;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private String nombre;
    private int nit;
    private ArrayList<Empleado>empleados;
    private ArrayList<Departamento>departamentos;

    public Empresa(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.empleados=new ArrayList<>();
        this.departamentos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNit() {
        return nit;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
    public boolean addEmpleado(Empleado empleado){
    if(this.empleados.add(empleado)==true){//pues el add me retorna un booleano
    return true;
    }else return false;
    }
    public boolean addDepartamento(Departamento departamento){
    if(this.departamentos.add(departamento)==true){
    return true;
    
    }else{
    return false;
    }
    
    }
    public ArrayList<Departamento>listarDepartamentos(){
    return this.departamentos;
    }
    
    public Empleado darDirector(String NombreDepartamento){
        Empleado director=null;
    for(int i=0;i<this.departamentos.size();i++){
    Departamento aux=this.departamentos.get(i);
    if(aux.getNombre().equals(NombreDepartamento)){
    director=aux.darDirector();
    break;
    }
    
    }
    return director;
    }
}
