package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CaesarCipher c = new CaesarCipher();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String message = null;

		try {
			message = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
			System.exit(1);
		}
		System.out.println("Enter key: ");
		Scanner in = new Scanner(System.in);
		int key = in.nextInt();
        String encrypted = c.encrypt(message, key);
        System.out.println("key is " + key + "\nEncrypted message: " + encrypted);
    }
}
