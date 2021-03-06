package fi.jope.logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ASCIIMuuntajaTest {
        
    ASCIIMuuntaja a;
    
    @Before
    public void setUp() {
        a = new ASCIIMuuntaja();
    }
    
    @Test
    public void merkkiToASCIIToimii() {
        assertEquals("97 115 99 105 105", a.merkkiToASCII("ascii"));
        assertEquals("65 83 67 73 73", a.merkkiToASCII("ASCII"));
    }
    
    @Test
    public void ASCIIToMerkkiToimii() {
        assertEquals("ASCII", a.asciiToMerkki("6583677373"));
        assertEquals("ascii", a.asciiToMerkki("9711599105105"));
    }
    
    @Test
    public void ASCIIToMerkkiHuomaaVirheellisenASCIIn() {
        assertEquals("Virhe: virheellinen ASCII", a.asciiToMerkki("82846662a4"));
        assertEquals("Virhe: ethän laita turhia etunollia", a.asciiToMerkki("097115099105105"));
        assertEquals("Virhe: virheellinen ASCII", a.asciiToMerkki("971159910510"));
        assertEquals("Virhe: virheellinen ASCII", a.asciiToMerkki("658367737"));
    }
}
