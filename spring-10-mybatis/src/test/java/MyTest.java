import com.zjy.dao.UserMapper;
import com.zjy.dao.UserMapperImpl;
import com.zjy.pojo.User;
import com.zjy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = ac.getBean("userMapperImpl", UserMapper.class);
        for (User user : userMapperImpl.selectUser()) {
            System.out.println(user);
        }
    }

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = ac.getBean("userMapperImpl2", UserMapper.class);
        for (User user : userMapperImpl.selectUser()) {
            System.out.println(user);
        }
    }
}
