package jilit.clx.service.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jilit.clx.entities.ProgramMaster;
import jilit.clx.entities.StudentMaster;
import jilit.clx.entities.BranchMaster;

import jilit.clx.repository.StudentMasterRepository;
import jilit.clx.service.StudentMasterService;


@Service
public class StudentMasterServiceImpl implements StudentMasterService
{

	// Dependency of the controller
	@Autowired
	StudentMasterRepository studentMasterRepo;
	
	public Optional<StudentMaster> getStudentByID(String id) 
	{
		Optional<StudentMaster> stud = studentMasterRepo.findById(id);
		if (stud.isPresent()) {			 
			System.out.println("Following emp are loaded:");			 
			
		}
		return stud;
	}
	
	public Iterable<StudentMaster> getAllStudentsList() 
	{
		return studentMasterRepo.findAll();
	}

	
 
	
}
