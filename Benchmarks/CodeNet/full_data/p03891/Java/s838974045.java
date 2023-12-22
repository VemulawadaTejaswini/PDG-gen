import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		int d = 0;
		int e = sc.nextInt();
		int f = 0;
		
		int g = 0;
		int h = 0;
		int i = 0;
		int sum = 0;
		for (c = 0; c <= 100; c++) {
			sum = a + b + c; // r=1
			h = sum - b - e; // c=2
			i = sum - a - e; // x=\
			f = sum - c - i; // c=3
			g = sum - h - i; // r=3
			d = sum - a - g; // c=1
			if (sum == d + e + f && // r=2
				sum == c + e + g) { // x=/
				break;
			}
		}
		System.out.println(a + " " + b + " " + c);
		System.out.println(d + " " + e + " " + f);
		System.out.println(g + " " + h + " " + i);
	}
}
