import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = y+z, lo = 0;
		lo = x - z;
		lo = lo / a;
		System.out.println(lo);
	}
}