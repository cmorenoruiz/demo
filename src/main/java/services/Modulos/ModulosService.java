package services.Modulos;

import com.example.demo.models.Modulo;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
public interface ModulosService {
    List<Modulo> findAll();

    Optional<Modulo> findById(Long id);

    Optional<Modulo> findByUuid(UUID uuid);

    //Estoy suponiendo que puede haber varios módulos con el mismo nombre.
    List<Modulo> findAllByNombre(String nombre);

    //Un profesor puede impartir muchos módulo
    List<Modulo> findAllByProfesorId(Long id);

    void deleteById(Long id);
}
