/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barberturn.modelo.repository;

import com.barberturn.modelo.Cliente;
import org.springframework.data.repository.ListCrudRepository;

public interface ClienteRepository extends ListCrudRepository<Cliente, Long> {
   
}