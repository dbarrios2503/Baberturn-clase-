
package com.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Turno {


    @Id
    private Long id;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Local local;

    private LocalDateTime fecha;

    private String estado;

}
