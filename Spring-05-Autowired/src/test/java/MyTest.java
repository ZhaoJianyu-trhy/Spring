import com.zjy.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        People people = ac.getBean("people", People.class);
        people.getCat().bark();
        people.getDog().bark();
    }
}
