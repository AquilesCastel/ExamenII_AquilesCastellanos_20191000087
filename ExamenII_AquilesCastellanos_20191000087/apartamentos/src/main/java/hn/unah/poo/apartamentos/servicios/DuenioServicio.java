package hn.unah.poo.apartamentos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.poo.apartamentos.modelos.Duenio;
import hn.unah.poo.apartamentos.repositorios.DuenioRepositorio;

import java.util.List;

@Service
public class DuenioServicio {
    
    @Autowired 
    private DuenioRepositorio duenioRepositorio;

    public List<Duenio> obtenerTodos() {
        return duenioRepositorio.findAll();
    }

    public Duenio buscarPorId(String dni) {
        return duenioRepositorio.findById(dni).orElse(null);
    }

    public String crearDuenio(Duenio duenio) {
        if (duenioRepositorio.existsById(duenio.getDni())) {
            return "Ya existe el dueño";
        }
        duenioRepositorio.save(duenio);
        return "Dueño almacenado satisfactoriamente";
    }

    public String eliminarDuenio(String dni) {
        if (!duenioRepositorio.existsById(dni)) {
            return "No existe el dueño";
        }
        duenioRepositorio.deleteById(dni);
        return "Dueño eliminado satisfactoriamente";
    }
}