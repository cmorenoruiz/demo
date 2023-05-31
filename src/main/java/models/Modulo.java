package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
public class Modulo {
    private final String name;
    private final long id;
    private final UUID uuid;
    private long profesorId; //id del profesor, puede ser null
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
