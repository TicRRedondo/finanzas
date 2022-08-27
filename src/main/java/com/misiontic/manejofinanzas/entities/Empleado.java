package com.misiontic.manejofinanzas.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String email;
    @OneToMany(mappedBy = "empleado")
    private List<MovimientoDeDinero> movimientoDeDineros;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private List<Empresa> empresaList;


    public Empleado (){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MovimientoDeDinero> getMovimientoDeDineros() {
        return movimientoDeDineros;
    }

    public void setMovimientoDeDineros(List<MovimientoDeDinero> movimientoDeDineros) {
        this.movimientoDeDineros = movimientoDeDineros;
    }

    public List<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(List<Empresa> empresaList) {
        this.empresaList = empresaList;
    }


}
