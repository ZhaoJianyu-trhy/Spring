import com.zjy.dao.*;
import com.zjy.service.UserService;
import com.zjy.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void dynamicTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService userServiceImpl = (UserService) ac.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
