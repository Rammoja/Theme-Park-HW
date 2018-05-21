import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {
    InternetRadio internetRadio;

    @Before
    public void before(){
        internetRadio = new InternetRadio();
    }

    @Test
    public void canTune(){
        assertEquals("tune: Fourth one.", internetRadio.tune("Fourth one."));
    }

    @Test
    public void canGetConnectionStatus(){
        TestCase.assertEquals("Internet Radio connected to network CodeClan.", internetRadio.connectionStatus("CodeClan"));
    }
}
