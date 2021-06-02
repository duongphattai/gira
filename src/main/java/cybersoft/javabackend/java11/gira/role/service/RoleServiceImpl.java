package cybersoft.javabackend.java11.gira.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java11.gira.role.model.Role;
import cybersoft.javabackend.java11.gira.role.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository _repository;

	@Override
	public void save(Role role) {
		_repository.save(role);

	}

	@Override
	public List<Role> findAll() {

		return _repository.findAll();
	}

	@Override
	public List<Role> findByRoleName(String roleName) {
		
		return _repository.findByRoleName(roleName);
	}

	@Override
	public List<Role> findByDescription(String description) {
		
		return _repository.findByDescriptionContainingOrderByIdAsc(description);
	}

}
