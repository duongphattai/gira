package cybersoft.javabackend.java11.gira.role.repository;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.java11.gira.role.model.Role;

@Repository
public class RoleRepositoryImpl implements RoleRepository {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Role role) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(role);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public List findAll() {
		Session session = sessionFactory.openSession();
		
		return null;
		
		
	}

	@Override
	public Role findById(Long id) {
		Session session = sessionFactory.openSession();
		return session.find(Role.class, id);
	}

	@Override
	public void delete(Role role) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(role);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
