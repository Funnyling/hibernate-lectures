import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author ntishkevich
 */
public class Application {
    public static void main(String[] args) {
//        Configuration cfg = new Configuration()
//                .addAnnotatedClass(Message.class)
//                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL94Dialect")
//                .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
//                .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres?currentSchema=hibernate_lectures")
//                .setProperty("hibernate.connection.username", "postgres")
//                .setProperty("hibernate.connection.password", "postgres");

        Configuration cfg = new Configuration()
                .addAnnotatedClass(Message.class);

//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Message.class);

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Message helloWorld = session.get(Message.class, 1);
        System.out.println(helloWorld);
        session.close();
    }


}
