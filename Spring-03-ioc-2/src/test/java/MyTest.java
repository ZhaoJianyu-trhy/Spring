import com.zjy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) ac.getBean("b");
        User user2 = (User) ac.getBean("user");
        System.out.println(user == user2);
        System.out.println(user.toString());
    }

    @Test
    public void Test() {

    }
}
