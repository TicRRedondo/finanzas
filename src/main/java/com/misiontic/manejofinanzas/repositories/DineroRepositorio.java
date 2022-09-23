package com.misiontic.manejofinanzas.repositories;


import com.misiontic.manejofinanzas.models.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DineroRepositorio extends JpaRepository<MovimientoDinero,Long> {
}
