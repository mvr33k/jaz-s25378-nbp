package BankService.jaz_s25378_nbp.controller;

import BankService.jaz_s25378_nbp.model.CurRate;
import BankService.jaz_s25378_nbp.service.BankService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }


    @GetMapping("/{currency}/{startDate}/{endDate}")
    public ResponseEntity<CurRate> getAverageCurRate(@PathVariable String currency,
                                                     @PathVariable LocalDate startDate,
                                                     @PathVariable LocalDate endDate) {
        return ResponseEntity.ok(bankService.getAverageRate(currency,startDate,endDate));
    }
}
