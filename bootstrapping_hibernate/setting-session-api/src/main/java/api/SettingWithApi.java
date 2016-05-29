package api;

import model.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * @author ntishkevich
 */
public class SettingWithApi {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().addAnnotatedClass(Message.class)
                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL94Dialect")
                .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres?currentSchema=hibernate_lectures")
                .setProperty("hibernate.connection.username", "postgres")
                .setProperty("hibernate.connection.password", "12345");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Message helloWorld = session.get(Message.class, 1);
        System.out.println(helloWorld);

        session.close();
        factory.close();
    }
}
