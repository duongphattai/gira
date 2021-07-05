package cybersoft.javabackend.java11.gira.project.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import cybersoft.javabackend.java11.gira.project.model.ProjectType;
import cybersoft.javabackend.java11.gira.project.validation.annotation.ExistsProjectType;
import cybersoft.javabackend.java11.gira.project.validation.annotation.ExistsUser;
import cybersoft.javabackend.java11.gira.user.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@FromDateToDate(fromDate="startDate", toDate = "endDate")
public class UpdateProjectDto {
	
	@Size(min = 3, max = 100, message = "{project.name.size}")
	private String name;
	
	@Size(min = 3, max = 7, message = "{project.code.size}")
	private String code;
	
	private String icon;
	
	private String description;
	
	private LocalDateTime startDate; // getStartDate
	private LocalDateTime endDate;
	
	@ExistsUser(message = "Owner does not exist.")
	private String owner;
	@ExistsUser(message = "Manager does not exist.")
	private String manager;

	@ExistsProjectType
	private Long projectTypeId; 
}
