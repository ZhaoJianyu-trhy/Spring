import com.zjy.pojo.Student;
import com.zjy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student stu = (Student) ac.getBean("stu");
//        System.out.println(stu.getAddress().getAddress());
//        System.out.println(stu.toString());
    }

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");
        User user = ac.getBean("user", User.class);
        User user2 = ac.getBean("user", User.class);
        System.out.println(user == user2);
    }
}
