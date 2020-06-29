import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void createCaesarCipher_instanceOfCaesarCipher(){
        CaesarCipher cipher = new CaesarCipher("testing input string");
        assertTrue(cipher instanceof CaesarCipher);

    }
    @Test
    public void getInputString_returnString_String(){
        CaesarCipher cipher = new CaesarCipher("testing Input String");
        assertEquals("testing Input String", cipher.getInputString());
        }



}