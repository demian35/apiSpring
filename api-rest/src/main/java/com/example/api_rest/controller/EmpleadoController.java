package com.example.api_rest.controller;


import com.example.api_rest.Empleado;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/empleados")

//clase que funje como el controlador del sistema
public class EmpleadoController {
    //creamos una lista de empleados
    private List<Empleado> empleados= new ArrayList<>();

    //metodo para obtener los empleados
    @GetMapping("/empleados")
    public List<Empleado> getAllmpleados(){
        return empleados;
    }

    //obtenemos el empleado por su id
    @GetMapping("/empleados/{id}")
    public Empleado getEmpleadoById(@PathVariable int id){
        return empleados.stream().filter(e->e.getidEmpleado()==id).findFirst().orElse(null);
    }

    //creamos un nuevo empleado
    @PostMapping("path")
    public Empleado agregaEmpleado(@RequestBody Empleado empleado) {
        //TODO: process POST request
        empleados.add(empleado);
        return empleado;
    }
    

    //metodo para actualizar el empleado
    @PutMapping("path/{id}")
    public Empleado ActualizaEmpleado(@PathVariable int id, @RequestBody Empleado empleado) {
        //TODO: process PUT request
        
        return null;
    }


}
