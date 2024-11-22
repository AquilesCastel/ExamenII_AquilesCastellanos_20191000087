package hn.unah.poo.apartamentos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hn.unah.poo.apartamentos.modelos.Duenio;
import hn.unah.poo.apartamentos.servicios.DuenioServicio;

import java.util.List;

@RestController
@RequestMapping("/api/duenios")
public class DuenioController {

    @Autowired 
    private DuenioServicio duenioServicio;

    @GetMapping("/obtener")
    public List<Duenio> obtenerTodos() {
        return duenioServicio.obtenerTodos();
    }

    @GetMapping("/buscar/{dni}")
    public Duenio buscarPorId(@PathVariable String dni) {
        return duenioServicio.buscarPorId(dni);
    }

    @PostMapping("/crear")
    public String crearDuenio(@RequestBody Duenio duenio) {
        return duenioServicio.crearDuenio(duenio);
    }

    @DeleteMapping("/eliminar/{dni}")
    public String eliminarDuenio(@PathVariable String dni) {
        return duenioServicio.eliminarDuenio(dni);
    }
}