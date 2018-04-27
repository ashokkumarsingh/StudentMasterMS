package jilit.clx.controler;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jilit.clx.repository.ProgramMasterRepository;
import jilit.clx.service.ProgramMasterService;
import jilit.clx.entities.ProgramMaster;
import jilit.clx.entities.StudentMaster;


@RestController
public class ProgramMasterController {

	// Dependency of the controller
	@Autowired
	ProgramMasterService programMasterService;

	// method to fetch a department using id
	@GetMapping(value = "/program/{id}")
	public Optional<ProgramMaster> programById(@PathVariable Integer id)   {
		Optional<ProgramMaster> pm=programMasterService.getProgramMaster(id);
		return pm;
	}

	 
	@RequestMapping (value="/programs",method=RequestMethod.GET)
	public Iterable<ProgramMaster> getAllProgramList() throws Exception {
		//System.out.print("aaaaaaa");
		//Optional<ProgramMaster> pm=programMasterService.getProgramMaster(id);
		return programMasterService.getAllProgramList();

	}

}
