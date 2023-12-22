package uk.personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(new String(in.readLine()));
		// int c = 20;
		int total = c * 800;
		int discount = c / 15 * 200;
		System.out.println(total - discount);
	}

}
