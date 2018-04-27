package jilit.clx.service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;


import org.springframework.stereotype.Service;

import jilit.clx.entities.ProgramMaster;

@Service
public interface ProgramMasterService {


	public Optional<ProgramMaster> getProgramMaster(Integer id); 
	public Iterable<ProgramMaster> getAllProgramList() ;
	 
}
