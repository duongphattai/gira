package cybersoft.javabackend.java11.gira.role.service;



import java.util.List;

import cybersoft.javabackend.java11.gira.role.model.Role;

public interface RoleService {

	void save(Role role);
	
	List<Role> findAll();
	
	List<Role> findByRoleName(String roleName);
	
	List<Role> findByDescription(String description);
}
