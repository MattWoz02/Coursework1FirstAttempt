import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dex2HexTest {

    public Dex2HexTest()
   {}
    Dex2Hex dex2Hex;

    @Before
    public void setUp() {
        dex2Hex = new Dex2Hex();
    }

    @Test
    public void testConversion() {
        tring[] args = {"15"};
        Dec2Hex.main(args);
    }
    
    @Test
    public void testNoInputArgument() {
        String[] args = {};
        Dec2Hex.main(args);
    }

    Test
    public void testInvalidInput() {
        String[] args = {"test"};
        Dec2Hex.main(args);
    }

    @Test
    public void testNegativeInput() {
        String[] args = {"-12"};
        Dec2Hex.main(args);
    }
}
