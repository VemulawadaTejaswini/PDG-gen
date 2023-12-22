import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		int result = 0;
		for (char c : a) {
			if(c == '1') result++;
		}
		System.out.println(result);
	}
}
