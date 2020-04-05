import instruments.drums.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drums drums;

    @Before
    public void before(){
        drums = new Drums("XC34", 3, 1, 2, "Yamaha", "classic","");
    }

    @Test
    public void hasModel(){
        assertEquals("XC34", drums.getModel());
    }

    @Test
    public void hasNumOfDrums(){
        assertEquals(3, drums.getNumOfDrums());
    }

    @Test
    public void hasNumOfBassDrums(){
        assertEquals(1, drums.getNumOfBassDrums());
    }

    @Test
    public void hasNumOfCymbals(){
        assertEquals(2, drums.getNumOfCymbals());
    }

    @Test
    public void hasPlayMethod(){
        assertEquals("Boom Boom Boom ting", drums.play());
    }

    @Test
    public void hasdefaultShopOwner(){
        assertEquals("Shop", drums.getOwner());
    }

    @Test
    public void canChangeOwner(){
        drums.changeOwner("Zelda");
        assertEquals("Zelda", drums.getOwner());
    }


}
