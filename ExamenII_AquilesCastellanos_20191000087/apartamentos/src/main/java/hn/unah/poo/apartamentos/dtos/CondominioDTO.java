package hn.unah.poo.apartamentos.dtos;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CondominioDTO {
    @Id
    private int numeroCondominio; 
    private int nivel; 
    private double area; 
    private String color; 
    private int parqueos; 
    
}
