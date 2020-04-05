import org.junit.Before;
import org.junit.Test;
import sparesAndAddons.GuitarString;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("guitar string", 2.00, 5.00);
    }

    @Test
    public void hasOwner(){
        assertEquals("Shop", guitarString.getOwner());
    }
}
