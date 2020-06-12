package ru.xdweloper.voa_light.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.xdweloper.voa_light.PojoRepos.Customer;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    List<Customer> findAllByOrderByIdAsc();
}
