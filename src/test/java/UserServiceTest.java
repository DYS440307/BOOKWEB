import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Test;


/**
 * dys
 * 2023/2/6 9:43
 *
 * @version 1.0
 */
  public class UserServiceTest {
    UserService userService = new UserServiceImpl();

    @Test
    public void registerUser() {
        userService.registerUser(new User(null, "bibiji", "666", "bibiji@qq.com"));
        userService.registerUser(new User(null, "bibiji2", "6662", "bibiji2@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null, "ddd", "ddd", null)));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("dy123s")) {
            System.out.println("用户名字存在");
        }else {
            System.out.println("用户名可用");
        }

    }
}