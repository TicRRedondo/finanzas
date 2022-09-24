package com.misiontic.manejofinanzas.services;

import com.misiontic.manejofinanzas.models.Empleado;
import com.misiontic.manejofinanzas.models.MyUserDetails;
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
            empleado=empleadoService.getEmpleado(username);
            System.out.println(empleado.toString());
            return new MyUserDetails(empleado);
        }catch (Exception e){
            e.printStackTrace();
            throw new UsernameNotFoundException(e.getMessage());

        }


    }
}
