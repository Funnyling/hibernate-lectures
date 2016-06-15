package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author ntishkevich
 */
public final class HibernateUtils {
    private final static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    private final static SessionFactory factory = cfg.buildSessionFactory();

    public static Session openSession() {
        return factory.openSession();
    }

    public static void closeSession(Session session) {
        session.close();
    }

    public static void closeFactory() {
        factory.close();
    }

}
