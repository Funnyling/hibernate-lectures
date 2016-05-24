package api;

import model.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ntishkevich
 * @version 24.05.2016
 */
public class SettingWithApi2 {

    public static void main(String[] args) {
        Map<String, String> properties = new HashMap<>();

        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL94Dialect");
        properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        properties.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres?currentSchema=hibernate_lectures");
        properties.put("hibernate.connection.username", "postgres");
        properties.put("hibernate.connection.password", "12345");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(properties).build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Message.class);

        SessionFactory factory = metadataSources.buildMetadata().buildSessionFactory();
        Session session = factory.openSession();

        Message helloWorld = session.get(Message.class, 1);
        System.out.println(helloWorld);

        session.close();
        factory.close();
    }
}
