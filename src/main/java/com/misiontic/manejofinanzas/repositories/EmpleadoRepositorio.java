package com.misiontic.manejofinanzas.repositories;


import com.misiontic.manejofinanzas.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado,Long> {
    public Empleado findByEmail(String email);
}
