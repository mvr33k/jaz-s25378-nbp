package BankService.jaz_s25378_nbp.storage;

import BankService.jaz_s25378_nbp.model.CurRate;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BankRepository extends JpaRepository<CurRate, Integer>{
}