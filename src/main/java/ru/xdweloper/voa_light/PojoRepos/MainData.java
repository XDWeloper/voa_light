package ru.xdweloper.voa_light.PojoRepos;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "maindata")
@Data
@NoArgsConstructor
public class MainData {

    @Id
    private long id;
    private String name;
    private Integer indication;
    private Float pay;
    private Date lastdate;
    private String phone;
    private Integer lastdiffer;
}
