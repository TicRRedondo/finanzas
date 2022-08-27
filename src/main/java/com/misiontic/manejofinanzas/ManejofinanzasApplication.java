package com.misiontic.manejofinanzas;

import com.misiontic.manejofinanzas.entities.Empleado;
import com.misiontic.manejofinanzas.entities.Empresa;
import com.misiontic.manejofinanzas.entities.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManejofinanzasApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ManejofinanzasApplication.class, args);
		//instanciación de Empresa
		Empresa empresa = new Empresa();
		empresa.setIdempresa(121545);
		empresa.setNombre("Celula Ltda");
		empresa.setNit("12146546545");
		empresa.setDireccion("carrera 5 # 43");
		System.out.println("La empresa "+empresa.getNombre()
				+" de id : "+empresa.getIdempresa()
				+" y nit : "+empresa.getNit()
				+" estar registrada en la dirección: "+empresa.getDireccion()+"\n");

		//instanciación de Empleado
		Empleado empleado = new Empleado();
		empleado.setId(12145345);
		empleado.setNombre("Empleado x");
		empleado.setEmail("emp.ado@gmail.com");
		System.out.println("El emplado con nombre: "+empleado.getNombre()
				+" de id : "+empleado.getId()
				+" tiene email: "+empleado.getEmail()+"\n");


		//instanciación de Movimiento dienero
		MovimientoDinero movimiento = new MovimientoDinero();
		movimiento.setMonto(54121.54);
		movimiento.setConcepto("pago servicios");
		movimiento.setIdMovimiento(15245L);
		System.out.println("El movimiento de dinero con id: "+movimiento.getIdMovimiento()
		+" se realizó con un monto de :"+movimiento.getMonto()
		+" por concepto de :"+movimiento.getConcepto()+"\n");


	}

}
