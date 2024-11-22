package hn.unah.poo.apartamentos.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="condominios")
public class Condominio {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroCondominio; 
    private int nivel; 
    private double area; 
    private String color; 
    private int parqueos; 

    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Duenio duenio; 
}

