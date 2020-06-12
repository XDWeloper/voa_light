package ru.xdweloper.voa_light.Repos;


import org.springframework.data.repository.PagingAndSortingRepository;
import ru.xdweloper.voa_light.PojoRepos.Infos;

import java.util.List;

public interface InfosRepo extends PagingAndSortingRepository<Infos, Long> {
    List<Infos> findAll();
}
