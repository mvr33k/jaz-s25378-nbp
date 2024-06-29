package BankService.jaz_s25378_nbp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class CurRate {

    @Id
    private Integer id;

    private LocalDate start;
    private LocalDate end;

    private String currency;

    private double averageRate;

}
