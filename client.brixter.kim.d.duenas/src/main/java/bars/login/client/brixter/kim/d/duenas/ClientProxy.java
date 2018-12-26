package bars.login.client.brixter.kim.d.duenas;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bars.login.server.brixter.kim.d.duenas.DAO.User;


@FeignClient(name="server.brixter.kim.d.duenas", url="localhost:8081")
public interface ClientProxy {
	
	
	@GetMapping("/all")
	public List<User> getAll();
	
	@GetMapping("/{username}/{password}")
	public List<User> getUserByNameAndPass(@PathVariable("username") final String userName, @PathVariable("password") final String password);
	
	@GetMapping("/{username}")
	public User geteUsername(@PathVariable("username") final String userName);
	
	@GetMapping("/{username}/{password}/{usertype}")
	public void saveUserByNameAndPass(@PathVariable("username") final String userName, @PathVariable("password") final String password, @PathVariable("usertype") final String userType);
}
