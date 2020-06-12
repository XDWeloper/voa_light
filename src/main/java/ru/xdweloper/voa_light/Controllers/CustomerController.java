package ru.xdweloper.voa_light.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.xdweloper.voa_light.PojoRepos.Customer;
import ru.xdweloper.voa_light.Repos.CustomerRepo;

import java.util.List;

@RestController
@RequestMapping("/data/cus")
@CrossOrigin
public class CustomerController {

    private CustomerRepo repo;

    @Autowired
    public CustomerController(CustomerRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<Customer> getAllDate(){
        return repo.findAllByOrderByIdAsc();
    }

}
