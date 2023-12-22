import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		System.out.println((int)Math.pow(100,D) * ((N == 100) ? 101 : N));
	}
}