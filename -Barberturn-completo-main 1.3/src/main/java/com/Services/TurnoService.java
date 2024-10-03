package com.Services;


import com.modelo.Turno;
import com.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {

    @Autowired
    private static TurnoRepository turnoRepository;

    // Crear o actualizar un turno
    public static Turno saveOrUpdate(Turno turno) {
        return turnoRepository.save(turno);
    }

    // Obtener todos los turnos
    public List<Turno> getAllTurnos() {
        return turnoRepository.findAll();
    }

    // Obtener turno por ID
    public Optional<Turno> findById(Long id) {
        return turnoRepository.findById(id);
    }

    // Eliminar un turno
    public void deleteTurno(Turno turno) {
        turnoRepository.delete(turno);
    }

    // Actualizar un turno por ID
    public Turno updateTurno(Long id, Turno updateTurno) {
        return turnoRepository.findById(id).map(turno -> {
            turno.setId(updateTurno.getId());
            turno.setFecha(updateTurno.getFecha());
            turno.setLocal(updateTurno.getLocal());
            turno.setEmpleado(updateTurno.getEmpleado());
            turno.setEstado((updateTurno.getEstado()));
            return turnoRepository.save(turno);  // Guardar turno actualizado
        }).orElseThrow(() -> new RuntimeException("Turno no encontrado"));
    }
}
