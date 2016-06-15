import org.hibernate.Session;
import utils.HibernateUtils;

/**
 * @author ntishkevich
 */
public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtils.openSession();

        HibernateUtils.closeSession(session);
        HibernateUtils.closeFactory();
    }
}
