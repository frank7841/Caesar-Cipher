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
    @Test
    public void encryptText_shiftLettersBeyondZ_String() {
        CaesarCipher cipher = new CaesarCipher("z");
        assertEquals("a", cipher.encryptText("right",1));
    }
    @Test
    public void encryptText_encryptWhitespaces_String() {
        CaesarCipher cipher = new CaesarCipher("a b");
        assertEquals("c d", cipher.encryptText("right",2));
    }
    @Test
    public void encryptText_dealingWithNonAlphabets_String() {
        CaesarCipher cipher = new CaesarCipher("1-2.3");
        assertEquals("1-2.3", cipher.encryptText("right",3));
    }
    @Test
    public void encryptText_shiftLettersToLeftBy1_String() {
        CaesarCipher cipher = new CaesarCipher("b");
        assertEquals("a", cipher.encryptText("left",1));
    }
    @Test
    public void decryptText_receiveInput_String(){
        CaesarCipher cipher = new CaesarCipher("testing");
        assertTrue(cipher.decryptText("right", 1) instanceof String);
    }


}