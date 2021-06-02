package cybersoft.javabackend.java11.gira.role.repository;



import org.hibernate.mapping.List;

import cybersoft.javabackend.java11.gira.role.model.Role;

public interface RoleRepository {
	
	List findAll();
	
	void save(Role role);
	
	Role findById(Long id);
	
	void delete(Role role);
}
