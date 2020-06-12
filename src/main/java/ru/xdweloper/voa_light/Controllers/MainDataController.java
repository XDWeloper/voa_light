package ru.xdweloper.voa_light.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.xdweloper.voa_light.PojoRepos.MainData;
import ru.xdweloper.voa_light.Repos.MainDataRepo;
import ru.xdweloper.voa_light.Services.AuthService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin
public class MainDataController {
    private MainDataRepo repo;

    private AuthService authService;


    public MainDataController(MainDataRepo repo, AuthService authService) {
        this.repo = repo;
        this.authService = authService;
    }

    @GetMapping
    public List<MainData> getAllDate(final HttpServletRequest request){
        if(!authService.isAuth(request))
            return null;
        return repo.findAllByOrderByIdAsc();
    }



}
