package jilit.clx.service;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;


import jilit.clx.entities.StudentMaster;

@Service
public interface StudentMasterService {


	public Optional<StudentMaster> getStudentByID(String id); 
	public Iterable<StudentMaster> getAllStudentsList() ;
	 
}
