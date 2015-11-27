import junit.framework.TestCase;

/**
 * Created by Robert on 2015-11-27.
 */
public class CaesarCipherTest extends TestCase {

	public void testEncrypt() throws Exception
	{
		CaesarCipher c = new CaesarCipher();

		String input = "FIRST LEGION ATTACK EAST FLANK!";
		int key = 23;
		String answer = "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!";

		assertEquals(answer, c.encrypt(input, key));
	}
}