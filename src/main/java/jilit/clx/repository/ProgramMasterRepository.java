package jilit.clx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jilit.clx.entities.ProgramMaster;

	@Repository
	public interface ProgramMasterRepository extends JpaRepository<ProgramMaster, Integer> 
	{		
		
	
	}
