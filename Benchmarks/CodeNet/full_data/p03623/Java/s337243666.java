import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dist_a = Math.abs(x-a);
		int dist_b = Math.abs(x-b);
		if(dist_a > dist_b)System.out.println("B");
		else System.out.println("A");

	}
}
