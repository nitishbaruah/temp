package nitish.blackCoffer.Repository;

import nitish.blackCoffer.Models.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface dataRepository extends JpaRepository<Data, Integer> {

    @Query(value="select * from data d where d.sector=:sector")
    List<String> getSectorAndCount();
}
