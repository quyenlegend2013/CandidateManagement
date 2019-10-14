package nhom3.candidate.DAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nhom3.candidate.DAO.adminDAO;
import nhom3.candidate.model.Admin;
import nhom3.candidate.model.Role;

@Repository
@Transactional
public class adminDAOimpl implements adminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Admin findUserInfo(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getUserRole(String email) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT r.role_name FROM Role r WHERE r.role_code=: role_code ");
		query.setParameter("role_code",email);
		List<Role> roleList=query.list();
		return roleList;
	}

}
