package jilit.clx.service.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jilit.clx.entities.ProgramMaster;
import jilit.clx.entities.BranchMaster;
import jilit.clx.repository.ProgramMasterRepository;
import jilit.clx.service.ProgramMasterService;


@Service
public class ProgramMasterServiceImpl implements ProgramMasterService
{

	// Dependency of the controller
	@Autowired
	ProgramMasterRepository programMasterRepo;
	
	public Optional<ProgramMaster> getProgramMaster(Integer id) 
	{
		Optional<ProgramMaster> progMasterObj = programMasterRepo.findById(id);
		return progMasterObj;
	}
	
	public Iterable<ProgramMaster> getAllProgramList() 
	{
		return programMasterRepo.findAll();
	}
	
}
