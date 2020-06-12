package ru.xdweloper.voa_light.PojoRepos;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Infos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Float energycost;
    private Float rentcost;
    private Float internet;

}
