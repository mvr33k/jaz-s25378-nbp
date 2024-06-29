package BankService.jaz_s25378_nbp.controller;

import BankService.jaz_s25378_nbp.model.CurRate;
import BankService.jaz_s25378_nbp.service.BankService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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


    @Operation(summary = "Oblicz średnią wartość walut w przedziale", description = "Komunikuje się z api nbp i zbiera dane o wartości waluty z x dni, po czym oblicza ich średnią wartość")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operacja została poprawnie wykonana"),
            @ApiResponse(responseCode = "404", description = "Nieprawidłowo sformułowanych zapytania lub został przekroczony limit"),
            @ApiResponse(responseCode = "400", description = "Braku danych dla prawidłowo określonego zakresu czasowego")
    })


    @GetMapping("/{currency}/{startDate}/{endDate}")
    public ResponseEntity<CurRate> getAverageCurRate(@PathVariable String currency,
                                                     @PathVariable LocalDate startDate,
                                                     @PathVariable LocalDate endDate) {
        return ResponseEntity.ok(bankService.getAverageRate(currency,startDate,endDate));
    }
}
