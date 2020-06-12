package ru.xdweloper.voa_light.PojoRepos;

import lombok.Data;

@Data
public class AuthToken {
    String token;
    String expiresIn;
}
