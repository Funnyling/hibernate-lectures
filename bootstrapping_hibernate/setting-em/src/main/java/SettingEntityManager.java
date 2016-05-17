import model.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author ntishkevich
 */
public class SettingEntityManager {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = emf.createEntityManager();

        Message helloWorld = entityManager.find(Message.class, 1);
        System.out.println(helloWorld);

        entityManager.close();
        emf.close();
    }
}
