import behaviour.PianoStyle;
import instruments.guitars.Guitar;
import instruments.pianos.Piano;
import org.junit.Before;
import org.junit.Test;
import sparesAndAddons.DrumStick;
import sparesAndAddons.GuitarString;


import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    GuitarString guitarString;
    DrumStick drumStick;
    PianoStyle pianoStyle;

    @Before
    public void before(){
        shop = new Shop("Ray's music shop", 500.00);
        guitar = new Guitar("abc", 6, "Sony", "purple", 124.50, 500.00);
        piano = new Piano("def", pianoStyle.ELECTRONIC, "Custom", "black", 1200.00, 4259.99 );
        drumStick = new DrumStick("Hard drumStick", 4.55, 12.99);
        guitarString = new GuitarString("accoustic", 3.45, 7.99);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's music shop", shop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddISellItem(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        System.out.println(shop.getStock());
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canRemoveItem(){
        shop.addToStock(guitar, piano, piano);
//        shop.addToStock(piano);
//        shop.addToStock(piano);
        System.out.println("I am line 53 in Shop Test: " + shop.getStock());
        shop.removeFromStock(piano);
        System.out.println("I am line 55 in Shop Test: " + shop.getStock());
        assertEquals(2, shop.getStockSize());
        shop.addToStock(guitarString);
        System.out.println("I am line 58 in Shop Test: " + shop.getStock());
        assertEquals(3, shop.getStockSize());
    }
}
