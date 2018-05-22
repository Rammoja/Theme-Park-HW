import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


        Customer customer1;

        @Before
        public void before() {

            customer1 = new Customer("Phillip", 16, 5, 12);

        }


    @Test
    public void canGetName() {
        assertEquals("Phillip", customer1.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(16, customer1.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(5, customer1.getHeight());
    }

    @Test
    public void canGetMoney() {
        assertEquals(12, customer1.getMoney());
    }

}


