package ru.xdweloper.voa_light.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.xdweloper.voa_light.PojoRepos.MainData;
import ru.xdweloper.voa_light.PojoRepos.SmsData;

import java.util.List;

public interface SmsDataRepo extends JpaRepository<SmsData, Long> {
    List<SmsData> findAllByOrderByIdAsc();
}
