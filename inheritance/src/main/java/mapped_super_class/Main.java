package mapped_super_class;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

/**
 * @author ntishkevich
 */
public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtils.openSession();
        Cat cat = new Cat();
        cat.setId(1);
        cat.setName("Albert");
        cat.setWild(false);
        cat.setColor("White");
        cat.setInstagramLink("https://www.instagram.com/albertbabycat/");

        Fox fox = new Fox();
        fox.setId(1);
        fox.setName("Juniper");
        fox.setColor("Ginger");
        fox.setWild(true);
        fox.setZooName("Zoo Name");

        Transaction transaction = session.beginTransaction();
        session.save(cat);
        session.save(fox);
        transaction.commit();

        HibernateUtils.closeSession(session);
        HibernateUtils.closeFactory();
    }
}
