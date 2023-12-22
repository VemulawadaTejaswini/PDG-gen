import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = 0;
		int sum = 0;
		while (sum + a <= b && num < c) {
			sum += a;
			num++;
		}
		System.out.println(num);

	}

}
