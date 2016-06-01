import model.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author ntishkevich
 * @version 23.05.2016
 */
public class SettingEmpty {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().addAnnotatedClass(Message.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties()).build();

        SessionFactory factory = cfg.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();

        Message helloWorld = session.get(Message.class, 1);
        System.out.println(helloWorld);

        session.close();
        factory.close();
    }
}
