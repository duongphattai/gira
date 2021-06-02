package cybersoft.javabackend.java11.gira.role.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java11.gira.role.model.Role;
import cybersoft.javabackend.java11.gira.role.service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	@Autowired
	private RoleService _service;

	@PostMapping("")
	public ResponseEntity<Object> save(@RequestBody Role role) {
		System.out.println(role);
		_service.save(role);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{role-name}")
	public ResponseEntity<Object> findByRoleName(@PathVariable("role-name") String roleName) {

		List<Role> roles = _service.findByRoleName(roleName);

		if (roles == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(roles, HttpStatus.OK);

		}
	}

	@GetMapping("/description/{description}")
	public ResponseEntity<Object> findByDescription(@PathVariable("description") String description) {

		List<Role> roles = _service.findByDescription(description);

		if (roles == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(roles, HttpStatus.OK);

		}
	}

	@GetMapping("")
	public ResponseEntity<Object> findAll() {

		List<Role> roles = _service.findAll();

		if (roles == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(roles, HttpStatus.OK);

		}

	}

}
