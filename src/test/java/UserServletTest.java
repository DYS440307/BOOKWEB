import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * dys
 * 2023/2/10 11:36
 *
 * @version 1.0
 */
public class UserServletTest {
    public void login() {
        System.out.println("login方法调用了");
    }

    public void regist() {
        System.out.println("regist方法调用了");
    }

    public void updateUser() {
        System.out.println("updateUser方法调用了");
    }

    public void updateUserPassword() {
        System.out.println("updateUserPassword方法调用了");
    }

    public static void main(String[] args) {
        String action = "updateUser";
        try {
            //获取action.业务鉴别字符串，获取相应的业务方法反射对象
            Method method = UserServletTest.class.getDeclaredMethod(action);
            System.out.println(method);
            //调用目标业务方法
            method.invoke(new UserServletTest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
