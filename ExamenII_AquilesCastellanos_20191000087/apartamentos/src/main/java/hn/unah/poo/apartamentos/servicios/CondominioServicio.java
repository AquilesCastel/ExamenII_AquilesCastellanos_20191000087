package hn.unah.poo.apartamentos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.poo.apartamentos.modelos.Condominio;
import hn.unah.poo.apartamentos.repositorios.CondominioRepositorio;

@Service
public class CondominioServicio {

    @Autowired 
    private CondominioRepositorio condominioRepositorio;

    public String crearCondominio(Condominio condominio) {
        condominioRepositorio.save(condominio);
        return "Condominio creado satisfactoriamente";
    }
}