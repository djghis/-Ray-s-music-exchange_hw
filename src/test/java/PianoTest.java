import behaviour.PianoStyle;
import org.junit.Before;
import org.junit.Test;
import instruments.pianos.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;
    private PianoStyle pianoStyle;

    @Before
    public void before(){
        piano = new Piano("grand", pianoStyle.ACCOUSTIC, "Custom", "wood", "me", 100, 150 );
    }

    @Test
    public void hasPlay(){
        assertEquals("ding ding", piano.play());
    }

    @Test
    public void hasMarkupPercentage(){
        assertEquals(50, piano.markUpPercentage(), 0.01);
    }
}
