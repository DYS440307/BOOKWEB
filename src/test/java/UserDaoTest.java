import com.atguigu.dao.impl.UserDapImpl;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;


/**
 * dys
 * 2023/2/6 9:06
 *
 * @version 1.0
 */
class UserDaoTest {
    UserDapImpl userDao = new UserDapImpl();

    @Test
    void queryUserByUsername() {

        if (userDao.queryUserByUsername("dys") == null) {
            System.out.println("用户名可以使用");
        } else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    void queryUserByUsernameAndPassword() {
        if (userDao.queryUserByUsernameAndPassword("dys", "dys") == null) {
            System.out.println("用户名字或密码错误,登陆失败");
        } else {
            System.out.println("登录成功");
        }
    }

    @Test
    void saverUser() {
        System.out.println(userDao.saverUser(new User(null, "dada", "yyy", "dys123@qq.com")));
    }
}