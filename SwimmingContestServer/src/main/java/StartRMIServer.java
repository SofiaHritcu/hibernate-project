import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartRMIServer {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring_server.xml");

    }
}