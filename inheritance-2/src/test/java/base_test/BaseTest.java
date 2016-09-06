package base_test;

import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static utils.HibernateUtils.closeFactory;
import static utils.HibernateUtils.closeSession;
import static utils.HibernateUtils.openSession;

/**
 * @author ntishkevich
 * @version 05.09.2016
 */
public abstract class BaseTest {

    private Session session;

    @Before
    public void setUp() throws Exception {
        session = openSession();
    }

    @After
    public void tearDown() throws Exception {
        closeSession(session);
    }

    @Test
    public abstract void load();

    @AfterClass
    public static void tearDownFactory() {
        closeFactory();
    }
}
