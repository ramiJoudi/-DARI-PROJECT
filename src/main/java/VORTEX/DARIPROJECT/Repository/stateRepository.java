package VORTEX.DARIPROJECT.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import VORTEX.DARIPROJECT.ENTITY.real_estate;

@Repository
public interface stateRepository extends JpaRepository<real_estate,Long> {
	@Query("SELECT m.location FROM real_estate m WHERE m.location LIKE CONCAT('%',:location,'%')")
	public List<String> searchstate(@Param("location") String location);

}
