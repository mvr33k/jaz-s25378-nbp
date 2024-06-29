package BankService.jaz_s25378_nbp.service;

import BankService.jaz_s25378_nbp.model.CurRate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class BankService {

    public BankService(){}

    public CurRate getAverageRate(String currency, LocalDate startDate, LocalDate endDate){

        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("https://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + startDate + "/" + endDate, CurRate.class);
    }

//    http://api.nbp.pl/api/exchangerates/rates/a/gbp/2012-01-01/2012-01-31/
}
