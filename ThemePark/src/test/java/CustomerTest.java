import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


        Customer customer1;
        Customer customer2;

        @Before
        public void before() {

            customer1 = new Customer("Phillip", 7, 4, 12);
            customer2 = new Customer("Andrew", 15, 6, 25);
        }


    @Test
    public void canGetName() {
        assertEquals("Phillip", customer1.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(7, customer1.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(4, customer1.getHeight());
    }

}


