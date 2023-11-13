import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    public Dec2HexTest()
   {}
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    @Test
    public void testConversion() {
        String[] args = {"15"};
        Dec2Hex.main(args);
    }
    
    @Test
    public void testNoInputArgument() {
        String[] args = {};
        Dec2Hex.main(args);
    }

    @Test
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
