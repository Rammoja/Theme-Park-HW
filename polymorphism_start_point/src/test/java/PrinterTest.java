import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void canPrint() {
        assertEquals("printing: Hello World", printer.print("Hello World"));
    }

    @Test
    public void canGetConnectionStatus(){
        assertEquals("Ink Printer connected to network CodeClan.", printer.connectionStatus("CodeClan"));
    }
}
