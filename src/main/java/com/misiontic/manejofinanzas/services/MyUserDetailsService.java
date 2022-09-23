package com.misiontic.manejofinanzas.services;
/*
import chamorro.edisson.contabilidad.models.Empleado;
import chamorro.edisson.contabilidad.models.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    EmpleadoService empleadoService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Empleado empleado =null;
        System.out.println(username);
        try{
            empleado=empleadoService.getEmpleado(Long.valueOf(username));
            System.out.println(empleado);
        }catch (Exception e){
           throw new UsernameNotFoundException(e.getMessage());
        }

        return new MyUserDetails(empleado);
    }
}
*/