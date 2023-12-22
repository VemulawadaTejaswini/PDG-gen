
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = String.valueOf(n);
		
		int sum = 0;
		String sub = new String();
		for (int i = 0; i < s.length(); i++) {
			sub = s.substring(i, i + 1);
			sum += Integer.valueOf(sub);
		}
		
		System.out.println(sum);
	}
}