package com.misiontic.manejofinanzas.repositories;


import com.misiontic.manejofinanzas.models.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepositorio extends JpaRepository<Perfil,Long> {
}
