package hn.unah.poo.apartamentos.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="mensualidades")
public class Mensualidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensualidad;

    @ManyToOne 
    @JoinColumn(name="numeroCondominio", referencedColumnName = "numeroCondominio")
    private Condominio condominio;

    private double monto;
    private char estado;
    
    private LocalDate fechaPago;
}

