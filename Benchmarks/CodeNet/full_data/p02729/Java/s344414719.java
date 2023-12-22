import java.util.Scanner;

//AtCoder Beginner Contest 159
//A	The Number of Even Pairs
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		sc.close();

		System.out.println((N*(N-1))/2+(M*(M-1))/2);
	}
}
