package test;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Arrays.sort(args);
		System.out.println(Math.abs(minus(args[1], args[0]) + minus(args[2], args[1])));
	}

	private static int minus(String a, String b) {
		return Integer.parseInt(a) -  Integer.parseInt(b);
	}

}
