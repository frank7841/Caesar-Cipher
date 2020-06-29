import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void createCaesarCipher_instanceOfCaesarCipher(){
        CaesarCipher cipher = new CaesarCipher("testing input string");
        assertTrue(cipher instanceof CaesarCipher);

    }


}