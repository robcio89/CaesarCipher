package com.company;

/**
 * Created by Robert on 2015-11-27.
 */

public class CaesarCipher
{
	String alphabetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String alphabetLow = "abcdefghijklmnopqrstuvwxyz";

	public String encrypt(String input, int key)
	{
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

	public String encryptTwoKeys(String input, int key1, int key2)
	{
		StringBuilder encrypted = new StringBuilder(input);

		String shiftedAlphabetUp1 = alphabetUp.substring(key1) + alphabetUp.substring(0, key1);
		String shiftedAlphabetLow1 = alphabetLow.substring(key1) + alphabetLow.substring(0, key1);

		String shiftedAlphabetUp2 = alphabetUp.substring(key2) + alphabetUp.substring(0, key2);
		String shiftedAlphabetLow2 = alphabetLow.substring(key2) + alphabetLow.substring(0, key2);

		for (int i =0; i < encrypted.length(); i++)
		{
			char currChar = encrypted.charAt(i);

			if (alphabetUp.indexOf(currChar) != -1)
			{
				int idx = alphabetUp.indexOf(currChar);

				if (idx != -1)
				{
					char newChar;
					if (i % 2 == 0) {
						newChar = shiftedAlphabetUp1.charAt(idx);
					} else {
						newChar = shiftedAlphabetUp2.charAt(idx);
					}

					encrypted.setCharAt(i, newChar);
				}
			}
			else if (alphabetLow.indexOf(currChar) != -1)
			{
				int idx = alphabetLow.indexOf(currChar);

				if (idx != -1)
				{
					char newChar;

					if (i % 2 == 0) {
						newChar = shiftedAlphabetLow1.charAt(idx);
					} else {
						newChar = shiftedAlphabetLow2.charAt(idx);
					}

					encrypted.setCharAt(i, newChar);
				}
			}
		}
		return encrypted.toString();
	}
}
