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
@Table(name="duenios")
public class Duenio {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
}