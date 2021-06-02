package cybersoft.javabackend.java11.gira.role.service;

import org.hibernate.mapping.List;
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
	public List findAll() {

		return null;
	}

	@Override
	public Role findById(Long id) {
		return _repository.findById(id);
	}

	@Override
	public void delete(Role role) {
		_repository.delete(role);

	}

}
