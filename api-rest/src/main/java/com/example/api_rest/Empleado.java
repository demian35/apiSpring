package com.example.api_rest;

//clase para crear un objeto de tipo empleado modelo
public class Empleado {
    //atributos de clase 
    private int idEmpleado;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private long telefono;
    private String puesto;

    //constructor de nuestro objeto empleado
    public Empleado(int idEmpleado, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico,
    long telefono, String puesto) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.correoElectronico=correoElectronico;
        this.telefono=telefono;
        this.puesto=puesto;
    }

    //getters y setters del empleado

    public int getidEmpleado(){
        return idEmpleado;
    }

    public  void setidEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }
    
    public String getNombre(){
        return nombre;
    }

    public  void setNombre(String nombre){
        this.nombre = nombre;
    }

    public  String getApellidoPaterno(){
        return apellidoPaterno;
    }

    public void  setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }

    public  String getApellidoMaterno(){
        return apellidoMaterno;
    }

    





}
