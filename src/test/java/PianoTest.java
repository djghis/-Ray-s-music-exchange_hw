import behaviour.PianoStyle;
import org.junit.Before;
import org.junit.Test;
import pianos.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;
    private PianoStyle pianoStyle;

    @Before
    public void before(){
        piano = new Piano("grand", pianoStyle.ACCOUSTIC );
    }

    @Test
    public void hasPlay(){
        assertEquals("ding ding", piano.play());
    }
}
