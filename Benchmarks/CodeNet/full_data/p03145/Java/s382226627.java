import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp = (a + b + c) / 2;
		System.out.println((int)Math.sqrt(temp * (temp - a) * (temp - b) * (temp - c)));
	}
}
