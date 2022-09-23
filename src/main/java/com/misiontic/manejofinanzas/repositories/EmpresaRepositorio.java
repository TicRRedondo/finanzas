package com.misiontic.manejofinanzas.repositories;


import com.misiontic.manejofinanzas.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa,Long> {

}
