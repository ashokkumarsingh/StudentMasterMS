package jilit.clx.controler;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jilit.clx.service.StudentMasterService;
import jilit.clx.entities.ProgramMaster;
import jilit.clx.entities.StudentMaster;


@RestController
public class StudentMasterController {

	// Dependency of the controller
	@Autowired
	StudentMasterService studentMasterService;

	// method to fetch a department using id
	@GetMapping(value = "/student/{id}")
	public Optional<StudentMaster> studentById(@PathVariable String id)   {
		Optional<StudentMaster> pm=studentMasterService.getStudentByID(id);
		return pm;
	}

	// method to fetch all students  
	//@GetMapping(value = "/getstudentlist")
	@RequestMapping (value="/students",method=RequestMethod.GET)
	public Iterable<StudentMaster> getAllStudentsList() throws Exception {
		System.out.print("aaaaaaa");
		return studentMasterService.getAllStudentsList();

	}

}
