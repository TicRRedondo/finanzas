package com.misiontic.manejofinanzas.controllers;

import com.misiontic.manejofinanzas.entities.MovimientoDinero;
import com.misiontic.manejofinanzas.services.MovimientoDineroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/enterprises")
public class ControladorEmpresa {


    @Autowired
    MovimientoDineroServicio servicioDinero;




    //--------------Servicios para movimiento de dinero---------------------------

    @GetMapping("/{id}/movements")
    public List<MovimientoDinero> getMovimientos(@PathVariable("id") long id) {
        return this.servicioDinero.getMovimientos(id);
    }

    @PostMapping("/movements")
    public MovimientoDinero postMovimiento(@RequestBody MovimientoDinero movimientoNuevo) {
        return this.servicioDinero.postMovimiento(movimientoNuevo);
    }

    @PatchMapping("/{id}/movements")
    public void patchMovimientos(@PathVariable("id") long id, @RequestBody MovimientoDinero datos) {
        this.servicioDinero.patchMovimientoDinero(id, datos);
    }

    @DeleteMapping("/{id}/movements")
    public void deleteMovimiento(@PathVariable("id") long id) {
        this.servicioDinero.deleteMovimiento(id);
    }

}
