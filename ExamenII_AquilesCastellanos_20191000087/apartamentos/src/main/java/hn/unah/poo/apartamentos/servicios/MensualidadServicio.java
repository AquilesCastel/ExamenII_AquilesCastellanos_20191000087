package hn.unah.poo.apartamentos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.poo.apartamentos.dtos.MensualidadDTO;
import hn.unah.poo.apartamentos.modelos.Mensualidad;
import hn.unah.poo.apartamentos.repositorios.MensualidadRepositorio;

@Service
public class MensualidadServicio {

    @Autowired 
    private MensualidadRepositorio mensualidadRepositorio;

    public String crearMensualidad(MensualidadDTO mensualidadDTO) {
        Mensualidad nuevaMensualidad = new Mensualidad();
        nuevaMensualidad.setMonto(mensualidadDTO.getMonto());
        nuevaMensualidad.setEstado(mensualidadDTO.getEstado());
        nuevaMensualidad.setFechaPago(mensualidadDTO.getFechaPago());
        
        mensualidadRepositorio.save(nuevaMensualidad);
        return "Mensualidad creada satisfactoriamente";
    }
}