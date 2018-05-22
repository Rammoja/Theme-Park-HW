import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BumberCarsTest {

    BumperCars bumperCars;

    @Before
    public void before() {

        bumperCars = new BumperCars("Samson");
    }

    @Test
    public void hasName() {
        assertEquals("Samson", bumperCars.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals( 7, bumperCars.getPrice());
    }
}
