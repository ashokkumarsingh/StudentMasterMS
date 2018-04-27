package jilit.clx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jilit.clx.entities.StudentMaster;

@Repository
public interface StudentMasterRepository extends JpaRepository<StudentMaster, String> {
	

}
