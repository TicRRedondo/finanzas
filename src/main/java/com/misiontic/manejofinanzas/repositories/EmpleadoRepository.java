package com.misiontic.manejofinanzas.repositories;

import com.misiontic.manejofinanzas.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
