package ru.xdweloper.voa_light.Controllers;

import org.springframework.web.bind.annotation.*;
import ru.xdweloper.voa_light.PojoRepos.AuthToken;
import ru.xdweloper.voa_light.Services.AuthService;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthController {

    AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public AuthToken Auth(final HttpServletRequest request){
        return authService.CheckPin(request);
    }
}
