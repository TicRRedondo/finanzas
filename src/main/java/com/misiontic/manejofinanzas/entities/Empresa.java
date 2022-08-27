package com.misiontic.manejofinanzas.entities;

import javax.persistence.*;

@Entity
public class Empresa {
    //atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private long idempresa;
  private String nit;
  private String nombre;

  private String direccion;
     @OneToMany(mappedBy = "empresa")
     private List<Empleado>empleadoList= new Empleado();

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(long idempresa) {
        this.idempresa = idempresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empresa() {

    }
}

