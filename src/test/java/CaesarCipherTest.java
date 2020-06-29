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
    @Test
    public void encryptText_receiveInput_String(){
        CaesarCipher cipher = new CaesarCipher("testing");
        assertTrue(cipher.encryptText("right",1) instanceof String);
    }
    @Test
    public void encryptText_shiftLettersByOne_String() {
        CaesarCipher cipher = new CaesarCipher("a");
        assertEquals("b", cipher.encryptText("right",1));
    }
    @Test
    public void encryptText_shiftLettersByTwo_String() {
        CaesarCipher cipher = new CaesarCipher("a");
        assertEquals("c", cipher.encryptText("right",2));
    }


}