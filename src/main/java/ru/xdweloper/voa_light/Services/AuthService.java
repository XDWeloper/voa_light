package ru.xdweloper.voa_light.Services;


import org.springframework.stereotype.Service;
import ru.xdweloper.voa_light.PojoRepos.AuthToken;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

import static java.time.LocalDate.now;

@Service
public class AuthService {

    private String token;
    private int expires;
    private String pin = "2526";
    private boolean auth;
    private long authtime;
    private String authString;

    public AuthService() {
        this.authString = Base64.getEncoder().encodeToString(now().toString().concat(this.pin).getBytes());
        this.token = this.authString;
        this.expires = 600;
        this.auth = false;
    }

    public AuthToken CheckPin(HttpServletRequest request){
        AuthToken token = null;
        if(request.getParameter("pin").equalsIgnoreCase(this.pin)){
            token = new AuthToken();
            token.setToken(this.token);
            token.setExpiresIn(String.valueOf(this.expires));
            this.auth = true;
            this.authtime = System.currentTimeMillis();
        }
        return token;
    }

    public boolean isAuth(HttpServletRequest request){
        String a = request.getParameter("auth");
        if(request.getParameter("auth").equals(this.authString))
            return true;
        else return false;
//        long deltatime = System.currentTimeMillis() - this.authtime;
//        if(deltatime > this.expires * 1000)
//             return false;
//        else return true;

    }
}
