package services.Profesores;

import com.example.demo.models.Profesor;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfesoresService {
    List<Profesor> findAll();

    Optional<Profesor> findById(Long id);

    Optional<Profesor> findByUuid(UUID uuid);

    List<Profesor> findAllByNombre(String nombre);

    List<Profesor> findAllByFechaNombramiento(LocalDateTime fecha);

    void deleteById(Long id);
}
