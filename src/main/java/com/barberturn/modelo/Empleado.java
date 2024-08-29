/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barberturn.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Empleado {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idempleado; 

@Column(name = "Emple_nombre", nullable = false, columnDefinition = "String")
    private String Emple_nombre;

@Column(name = "Emple_apellido", nullable = false, columnDefinition = "String")
    private String Emple_apellido;

@Column(name = "Emple_telefono", columnDefinition = "long")
    private Long Emple_telefono;
    
@Column(name = "Emple_email", columnDefinition = "String")

    private String Emple_email;

@Column(name = "Emple_puesto", columnDefinition = "String")
    private String Emple_puesto;

    public Empleado() {
    }

    public Empleado(int idempleado, String Emple_nombre, String Emple_apellido, Long Emple_telefono, String Emple_email, String Emple_puesto) {
        this.idempleado = idempleado;
        this.Emple_nombre = Emple_nombre;
        this.Emple_apellido = Emple_apellido;
        this.Emple_telefono = Emple_telefono;
        this.Emple_email = Emple_email;
        this.Emple_puesto = Emple_puesto;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getEmple_nombre() {
        return Emple_nombre;
    }

    public void setEmple_nombre(String Emple_nombre) {
        this.Emple_nombre = Emple_nombre;
    }

    public String getEmple_apellido() {
        return Emple_apellido;
    }

    public void setEmple_apellido(String Emple_apellido) {
        this.Emple_apellido = Emple_apellido;
    }

    public Long getEmple_telefono() {
        return Emple_telefono;
    }

    public void setEmple_telefono(Long Emple_telefono) {
        this.Emple_telefono = Emple_telefono;
    }

    public String getEmple_email() {
        return Emple_email;
    }

    public void setEmple_email(String Emple_email) {
        this.Emple_email = Emple_email;
    }

    public String getEmple_puesto() {
        return Emple_puesto;
    }

    public void setEmple_puesto(String Emple_puesto) {
        this.Emple_puesto = Emple_puesto;
    }
        
    
}
