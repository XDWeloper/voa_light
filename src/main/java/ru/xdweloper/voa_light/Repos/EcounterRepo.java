package ru.xdweloper.voa_light.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.xdweloper.voa_light.PojoRepos.Ecounter;

import java.util.List;

public interface EcounterRepo extends JpaRepository<Ecounter, Long> {
    List<Ecounter> findAllByOrderByIdAsc();
}
