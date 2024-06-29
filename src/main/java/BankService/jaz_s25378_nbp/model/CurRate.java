package BankService.jaz_s25378_nbp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class CurRate {

    @Schema(name="ID operacji", example="3", required=true)
    @Id
    private Integer id;

    @Schema(name="Początkowa data do sprawdzenia wartości", example="3", required=true)
    private LocalDate start;

    @Schema(name="Końcowa data do sprawdzenia wartości", example="3", required=true)

    private LocalDate end;

    @Schema(name="Rodzaj waluty", example="3", required=true)

    private String currency;

    @Schema(name="Wyliczona średnia wartość z danego okresu", example="3.50", required=true)

    private double averageRate;

}
