import com.company.CaesarCipher;
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

	public void testEncrypt2() throws Exception
	{
		CaesarCipher c = new CaesarCipher();

		String input = "First Legion";
		int key = 23;
		String answer = "Cfopq Ibdflk";

		assertEquals(answer, c.encrypt(input, key));
	}

	public void testEncrypt3() throws Exception
	{
		CaesarCipher c = new CaesarCipher();

		String input = "First Legion";
		int key = 17;
		String answer = "Wzijk Cvxzfe";

		assertEquals(answer, c.encrypt(input, key));
	}

	public void testEncryptWithTwoKeys1() throws Exception
	{
		CaesarCipher c = new CaesarCipher();

		String input = "First Legion";
		int key1 = 23;
		int key2 = 17;
		String answer = "Czojq Ivdzle";

		assertEquals(answer, c.encryptTwoKeys(input, key1, key2));
	}

	public void testEncryptWithTwoKeys2() throws Exception
	{
		CaesarCipher c = new CaesarCipher();

		String input = "FIRST LEGION";
		int key1 = 23;
		int key2 = 17;
		String answer = "CZOJQ IVDZLE";

		assertEquals(answer, c.encryptTwoKeys(input, key1, key2));
	}
}