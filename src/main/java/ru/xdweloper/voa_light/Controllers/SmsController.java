package ru.xdweloper.voa_light.Controllers;

import org.springframework.web.bind.annotation.*;
import ru.xdweloper.voa_light.PojoRepos.SmsData;
import ru.xdweloper.voa_light.PojoRepos.SmsSending;
import ru.xdweloper.voa_light.Repos.SmsDataRepo;
import ru.xdweloper.voa_light.Repos.SmsPostRepo;

import java.util.List;

@RestController
@RequestMapping("/sms")
public class SmsController {

    private SmsDataRepo repo;
    private SmsPostRepo smsPostRepo;

    public SmsController(SmsDataRepo repo, SmsPostRepo smsPostRepo) {
        this.repo = repo;
        this.smsPostRepo = smsPostRepo;
    }

    @GetMapping
    public List<SmsData> GetSmsData() {
        return repo.findAllByOrderByIdAsc();
    }


    @PostMapping()
    public SmsSending PostSms(@RequestBody SmsSending smsSending) {
        smsPostRepo.save(smsSending);
        return smsSending;
    }
}