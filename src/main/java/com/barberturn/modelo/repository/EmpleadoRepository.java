/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barberturn.modelo.repository;

import com.barberturn.modelo.Empleado;
import org.springframework.data.repository.ListCrudRepository;


public interface EmpleadoRepository extends ListCrudRepository<Empleado, Long> {
   
}
