package projectfinal.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projectfinal.hrms.business.abstracts.Job_positionService;
import projectfinal.hrms.entities.Job_position;

@RestController
@RequestMapping("/api/job_positions")
public class job_positionsController {
	
	private Job_positionService job_positionService;

	@Autowired
	public job_positionsController(Job_positionService job_positionService) {
		super();
		this.job_positionService = job_positionService;
	}
	
	@GetMapping("/getall")
	public List<Job_position> getAll(){
		return this.job_positionService.getAll();
	}
}
