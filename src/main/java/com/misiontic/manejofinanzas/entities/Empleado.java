package com.misiontic.manejofinanzas.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String email;
    @OneToMany(mappedBy = "empleado")
    private List<ManejoDinero> manejoDineros;

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

    public List<ManejoDinero> getMovimientoDeDineros() {
        return manejoDineros;
    }

    public void setMovimientoDeDineros(List<ManejoDinero> movimientoDeDineros) {
        this.manejoDineros = movimientoDeDineros;
    }


}
