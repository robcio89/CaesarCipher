/**
 * Created by Robert on 2015-11-27.
 */
public class CaesarCipher
{
	public String encrypt(String input, int key)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder encrypted = new StringBuilder(input);
		String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);

		for (int i =0; i < encrypted.length(); i++)
		{
			char currChar = encrypted.charAt(i);

			int idx = alphabet.indexOf(currChar);

			if (idx != -1)
			{
				char newChar = shiftedAlphabet.charAt(idx);

				encrypted.setCharAt(i, newChar);
			}
		}
		return encrypted.toString();
	}
}
