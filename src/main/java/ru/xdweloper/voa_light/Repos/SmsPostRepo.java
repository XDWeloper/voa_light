package ru.xdweloper.voa_light.Repos;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.xdweloper.voa_light.PojoRepos.SmsSending;

public interface SmsPostRepo extends JpaRepository<SmsSending, Long> {

}
