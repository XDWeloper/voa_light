package ru.xdweloper.voa_light.PojoRepos;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "smssending")
@Data
@NoArgsConstructor
public class SmsSending {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long cusid;
//    private Date date;
}
