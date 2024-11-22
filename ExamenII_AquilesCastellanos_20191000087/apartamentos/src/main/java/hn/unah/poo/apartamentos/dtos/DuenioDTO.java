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
public class DuenioDTO {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
}
