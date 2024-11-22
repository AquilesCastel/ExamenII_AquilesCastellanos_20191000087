package hn.unah.poo.apartamentos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hn.unah.poo.apartamentos.modelos.Condominio;
import hn.unah.poo.apartamentos.servicios.CondominioServicio;

@RestController
@RequestMapping("/api/condominios")
public class CondominioController {

    @Autowired 
    private CondominioServicio condominioServicio;

    @PostMapping("/crear")
    public String crearCondominio(@RequestBody Condominio condominio) {
        return condominioServicio.crearCondominio(condominio);
    }
}
