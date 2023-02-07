import com.atguigu.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * dys
 * 2023/2/5 21:57
 *
 * @version 1.0
 */
public class JDBCUtilsTest {
    @Test
    public void testJdbcUtils() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        for (int i = 0; i < 100; i++) {

            System.out.println(connection);
            JDBCUtils.close(null, null, connection);
        }
    }
}
