package uk.personal;

import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int c = System.in.read();
		int total = c * 800;
		int discount = c / 15 * 200;
		System.out.println(total - discount);
	}

}