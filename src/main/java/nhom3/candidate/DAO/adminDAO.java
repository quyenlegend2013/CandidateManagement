package nhom3.candidate.DAO;

import java.util.List;

import nhom3.candidate.model.Admin;
import nhom3.candidate.model.Role;

public interface adminDAO {
	public Admin findUserInfo(String email);
	public List<Role> getUserRole(String email); 

}
