import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriathleteTest {

    Triathlete triathlete;

    @Before
    public void before() {
        triathlete = new Triathlete();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, triathlete.getDistanceTravelled());
    }


    @Test
    public void canRun(){
        triathlete.run(15);
        assertEquals(15, triathlete.getDistanceTravelled());

    }

    @Test
    public void canSwim(){
        triathlete.swim(5);
        assertEquals(5, triathlete.getDistanceTravelled());
    }

    @Test
    public void canCycle(){
        triathlete.cycle(25);
        assertEquals(25, triathlete.getDistanceTravelled());
    }


}
