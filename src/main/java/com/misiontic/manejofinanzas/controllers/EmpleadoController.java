package com.misiontic.manejofinanzas.controllers;

import com.misiontic.manejofinanzas.entities.Empleado;
import com.misiontic.manejofinanzas.entities.UsuarioResponse;
import com.misiontic.manejofinanzas.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleado")
    private List<Empleado> verEmpleados(){

        return empleadoService.verEmpleados();
    }

    @PostMapping("/empleado")
    private void crearEmpresa(@RequestBody Empleado empleado){

        empleadoService.CrearYActualizarEmpleado(empleado);
    }

    @DeleteMapping("/empleado/{id}")
    private void eliminarEmpleado(@PathVariable("id")Long id){

        empleadoService.eliminarEmpleado(id);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Object> getEmpleado(@PathVariable Long id){

        try {
            System.out.println("Metodo Url");
            Empleado empleado = empleadoService.getEmpleado(id);
            return new ResponseEntity<>(empleado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/empleado/{id}")
    public ResponseEntity<UsuarioResponse> patch(@RequestBody Empleado empleado, @PathVariable Long id){
        try {
            return new ResponseEntity<>(
                    new UsuarioResponse("Actualizacion Exitosa", empleadoService.patchEmpleado(empleado, id)),
                    HttpStatus.OK
            );
        } catch (Exception e) {
            return new ResponseEntity<>(
                    new UsuarioResponse(e.getMessage(), null),
                    HttpStatus.OK
            );
        }
    }
}
