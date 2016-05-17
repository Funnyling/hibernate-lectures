package xml;

import model.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * @author ntishkevich
 */
public class SettingWithXml {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Message.class);

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Message helloWorld = session.get(Message.class, 1);
        System.out.println(helloWorld);

        session.close();
        factory.close();
    }
}
