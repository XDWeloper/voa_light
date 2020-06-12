package ru.xdweloper.voa_light.Controllers;


import org.springframework.web.bind.annotation.*;
import ru.xdweloper.voa_light.PojoRepos.Infos;
import ru.xdweloper.voa_light.Repos.InfosRepo;

@RestController
@RequestMapping("/info")
@CrossOrigin
public class InfosController {

    InfosRepo infosRepo;

    public InfosController(InfosRepo infosRepo) {
        this.infosRepo = infosRepo;
    }

    @GetMapping("/{id}")
    public Infos GetInfo(@PathVariable Long id){
     return  infosRepo.findById(id).orElse(null);
    }
}
