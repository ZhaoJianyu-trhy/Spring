import com.zjy.service.UserService;
import com.zjy.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理，代理的是接口
        UserService userService = ac.getBean("userService", UserService.class);
        userService.select();
    }
}
