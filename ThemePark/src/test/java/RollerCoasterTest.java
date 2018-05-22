import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before() {

        rollerCoaster = new RollerCoaster("ThunderBall");
    }

    @Test
    public void canGetName() {
        assertEquals("ThunderBall", rollerCoaster.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(10, rollerCoaster.getPrice());
    }

    @Test
    public void canGetMinAge(){
        assertEquals(6, rollerCoaster.getMinAge());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(4, rollerCoaster.getMinHeight());
    }

}
