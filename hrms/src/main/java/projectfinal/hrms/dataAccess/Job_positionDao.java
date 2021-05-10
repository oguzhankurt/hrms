package projectfinal.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import projectfinal.hrms.entities.Job_position;

public interface Job_positionDao extends JpaRepository<Job_position, Integer> {

}
