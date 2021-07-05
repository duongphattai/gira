package cybersoft.javabackend.java11.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRoleDto {
	@NotBlank(message = "{role.name.notblank}")
	@Size(min = 4, max = 50, message = "{role.name.size}")
	private String roleName;
	
	@NotBlank(message = "{role.description.notblank}")
	private String description;
}
