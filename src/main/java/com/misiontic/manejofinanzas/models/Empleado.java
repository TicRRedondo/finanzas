package com.misiontic.manejofinanzas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

enum Role{
    ADMIN,
    USER
}
@Getter
@Setter
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    private long id;
    @Column
    private String nombre;


    @Column(unique = true)
    private String email;
    @Column
    private String password;


    @OneToOne
    private Perfil perfil;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "empleado")
    private List<MovimientoDinero> movimientoDineros;

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    private List<Role> roles;

    public Empleado(long id,String nombre,String email,String password, List<Role> roles){
        this.id=id;
        this.nombre=nombre;
        this.email=email;
        this.password=password;
        this.roles=roles;
    }
    public Empleado (){

    }

}
