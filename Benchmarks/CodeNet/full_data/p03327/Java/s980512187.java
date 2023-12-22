import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		if(1 <= N && N <= 999) {
			System.out.println("ABC");
		} else if(1000 <= N && N <= 1998) {
			System.out.println("ABD");
		}
	}
}