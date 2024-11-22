package hn.unah.poo.apartamentos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hn.unah.poo.apartamentos.dtos.MensualidadDTO;
import hn.unah.poo.apartamentos.servicios.MensualidadServicio;

@RestController
@RequestMapping("/api/mensualidades")
public class MensualidadController {

    @Autowired 
    private MensualidadServicio mensualidadServicio;

    @PostMapping("/crear")
    public String crearMensualidad(@RequestBody MensualidadDTO mensualidad) {
        return mensualidadServicio.crearMensualidad(mensualidad);
    }
}