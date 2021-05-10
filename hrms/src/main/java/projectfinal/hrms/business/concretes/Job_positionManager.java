package projectfinal.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectfinal.hrms.business.abstracts.Job_positionService;
import projectfinal.hrms.dataAccess.Job_positionDao;
import projectfinal.hrms.entities.Job_position;

@Service
public class Job_positionManager implements Job_positionService {
	private Job_positionDao job_positionDao;

	@Autowired
	public Job_positionManager(Job_positionDao job_positionDao) {
		super();
		this.job_positionDao = job_positionDao;
	}

	@Override
	public List<Job_position> getAll() {
		return job_positionDao.findAll();
	}

}
