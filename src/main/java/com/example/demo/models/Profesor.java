package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Clase Profesor POJO
 * A saber qué es POJO
 */
// Data: Genera los getters y setters, toString, equals, hashCode y el constructor con todos los parámetros necesarios (finals)
@Data
// AllArgsConstructor: Genera el constructor con todos los parámetros

@AllArgsConstructor
public class Profesor {
    private String name;
    //duda: ¿debería ser el nombre del profesor final?
    private final long id;
    private final UUID uuid;
    private LocalDateTime fechaNombramiento;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
