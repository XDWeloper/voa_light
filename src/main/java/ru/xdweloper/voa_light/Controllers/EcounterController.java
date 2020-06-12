package ru.xdweloper.voa_light.Controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.xdweloper.voa_light.PojoRepos.Ecounter;
import ru.xdweloper.voa_light.Repos.EcounterRepo;
import ru.xdweloper.voa_light.Services.AuthService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/data/ecount")
@CrossOrigin
public class EcounterController {

    private EcounterRepo repo;
    private AuthService authService;

    public EcounterController(EcounterRepo repo, AuthService authService) {
        this.repo = repo;
        this.authService = authService;
    }

    @GetMapping("/all")
    public List<Ecounter> getAllDate(){
        return repo.findAllByOrderByIdAsc();
    }

    @PostMapping("/create")
    public Ecounter CreateEcounter(@RequestBody Ecounter ecounter,final HttpServletRequest request){
        if(authService.isAuth(request))
            return repo.save(ecounter);
        else return null;
    }

    @PutMapping("/update/{id}")
    public Ecounter UpdateEcounter(
            @PathVariable("id") Ecounter ecounterFromBD,
            @RequestBody Ecounter ecounter){
        BeanUtils.copyProperties(ecounter,ecounterFromBD,"id");
        return repo.save(ecounterFromBD);
    }

    @DeleteMapping("/del/{id}")
    public void DeleteEcounter(@PathVariable("id") Ecounter ecounterFromDb){
        repo.delete(ecounterFromDb);
    }

}
