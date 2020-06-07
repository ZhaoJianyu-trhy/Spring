import com.zjy.config.zjyConfig;
import com.zjy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext zjyConfig = new AnnotationConfigApplicationContext(com.zjy.config.zjyConfig.class);
        User getUser = zjyConfig.getBean("user", User.class);
        System.out.println(getUser.toString());
    }
}
