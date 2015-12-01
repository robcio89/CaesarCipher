/**
 * Created by Robert on 2015-11-27.
 */
public class CaesarCipher
{
	public String encrypt(String input, int key)
	{
		String alphabetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetLow = "abcdefghijklmnopqrstuvwxyz";

		StringBuilder encrypted = new StringBuilder(input);

		String shiftedAlphabetUp = alphabetUp.substring(key) + alphabetUp.substring(0, key);
		String shiftedAlphabetLow = alphabetLow.substring(key) + alphabetLow.substring(0, key);

		for (int i =0; i < encrypted.length(); i++)
		{
			char currChar = encrypted.charAt(i);

			if (alphabetUp.indexOf(currChar) != -1)
			{
				int idx = alphabetUp.indexOf(currChar);

				if (idx != -1)
				{
					char newChar = shiftedAlphabetUp.charAt(idx);

					encrypted.setCharAt(i, newChar);
				}
			}
			else if (alphabetLow.indexOf(currChar) != -1)
			{
				int idx = alphabetLow.indexOf(currChar);

				if (idx != -1)
				{
					char newChar = shiftedAlphabetLow.charAt(idx);

					encrypted.setCharAt(i, newChar);
				}
			}
		}
		return encrypted.toString();
	}

	public void testCaesar()
	{
		// TODO
		// Read file
	}
}
