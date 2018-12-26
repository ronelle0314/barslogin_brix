package bars.login.server.brixter.kim.d.duenas.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bars.login.server.brixter.kim.d.duenas.DAO.User;

public interface UserRepository extends JpaRepository<User, Integer> {
 
	List<User> findByUserNameAndPassword(String userName, String password);
	User findByUserName(String userName);
	
}
