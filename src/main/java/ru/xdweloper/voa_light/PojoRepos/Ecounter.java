package ru.xdweloper.voa_light.PojoRepos;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table
@Data
@NoArgsConstructor
public class Ecounter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long ownerId;
    private int indication;
    private Date edate;
    private float pay;
}
