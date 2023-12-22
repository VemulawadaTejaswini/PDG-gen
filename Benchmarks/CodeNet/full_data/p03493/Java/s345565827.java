import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Integer.parseInt(s.substring(0, 1));
		int b = Integer.parseInt(s.substring(1, 2));
		int c = Integer.parseInt(s.substring(2, 3));
		int count = 0;
		if (a == 1) count++;
		if (b == 1) count++;
		if (c == 1) count++;
		System.out.println(count);
		sc.close();
	}
}
