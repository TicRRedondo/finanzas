package com.misiontic.manejofinanzas.services;

import com.misiontic.manejofinanzas.entities.Empleado;
import com.misiontic.manejofinanzas.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void CrearYActualizarEmpleado(Empleado empleado){

        empleadoRepository.save(empleado);
    }

    public List<Empleado> verEmpleados(){

        List<Empleado> empleados= new ArrayList<>();
        empleados.addAll(empleadoRepository.findAll());

        return empleados;
    }

    public void eliminarEmpleado(Long id){

        empleadoRepository.deleteById(id);

    }

    public Empleado getEmpleado(Long id)throws Exception{
        Optional<Empleado> empleadoOptional = empleadoRepository.findById(id);
        if(empleadoOptional.isPresent()){
            return empleadoOptional.get();
        }else{
            throw new Exception("Empleado No Existe");
        }
    }

    public Empleado saveEmpleado(Empleado empleado_param){
        return empleadoRepository.save(empleado_param);
    }

    public Empleado patchEmpleado(Empleado empleado_param, Long id) throws Exception {
        try {
            Empleado empleadoDb = getEmpleado(id);

            if(empleado_param.getNombre() != null){
                empleadoDb.setNombre(empleado_param.getNombre());
            }
            if(empleado_param.getEmail() != null){
                empleadoDb.setEmail(empleado_param.getEmail());
            }

            return saveEmpleado(empleadoDb);

        } catch (Exception e) {
            throw new Exception("Empleado no se actualizo, porque no existe");
        }
    }
}
