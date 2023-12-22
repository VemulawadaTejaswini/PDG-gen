import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x = in.nextInt();
		int a = in.nextInt();
		if (x < a)
			System.out.println("0");
		else
			System.out.println("10");
		in.close();
	}
}
