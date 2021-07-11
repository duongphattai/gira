package cybersoft.javabackend.java11.gira.project.service.itf;

import java.util.List;

import cybersoft.javabackend.java11.gira.commondata.GenericService;
import cybersoft.javabackend.java11.gira.project.dto.CreateProjectDto;
import cybersoft.javabackend.java11.gira.project.dto.UpdateProjectDto;
import cybersoft.javabackend.java11.gira.project.model.Project;

public interface ProjectService extends GenericService<Project, Long>{

	Project save(CreateProjectDto dto);

	Project update(UpdateProjectDto dto, Long id);

	List<Project> findAllByType(long typeId);

}
