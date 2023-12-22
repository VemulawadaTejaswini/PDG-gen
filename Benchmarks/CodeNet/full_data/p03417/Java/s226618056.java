package test;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long W = reader.nextLong();
		long H = reader.nextLong();
		System.out.print(Math.abs((H-2)*(W-2)));
		reader.close();
	}
}
