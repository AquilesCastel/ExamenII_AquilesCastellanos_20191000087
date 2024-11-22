package hn.unah.poo.apartamentos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hn.unah.poo.apartamentos.modelos.Condominio;

@Repository
public interface CondominioRepositorio extends JpaRepository<Condominio, Integer> { }
