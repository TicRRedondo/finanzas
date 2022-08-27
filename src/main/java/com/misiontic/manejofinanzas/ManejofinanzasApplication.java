package com.misiontic.manejofinanzas;

import com.misiontic.manejofinanzas.entities.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManejofinanzasApplication {

	public static void main(String[] args) {

		SpringApplication.run(ManejofinanzasApplication.class, args);
		//instanciación de Movimiento dienero
		MovimientoDinero movimiento = new MovimientoDinero();
		movimiento.setMonto(54121.54);
		movimiento.setConcepto("pago servicios");
		movimiento.setId(15245L);
		System.out.println("El movimiento de dinero con id: "+movimiento.getId()
		+" se realizó con un monto de :"+movimiento.getMonto()
		+" por concepto de :"+movimiento.getConcepto());

	}

}
