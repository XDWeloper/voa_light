package ru.xdweloper.voa_light.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.xdweloper.voa_light.PojoRepos.MainData;

import java.util.List;

public interface MainDataRepo extends JpaRepository<MainData, Long> {
    List<MainData> findAllByOrderByIdAsc();
}
