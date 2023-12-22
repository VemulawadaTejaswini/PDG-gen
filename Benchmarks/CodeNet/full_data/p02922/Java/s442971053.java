import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int i;
		for (i=1; A<B; i++) {
			A += A-1;
		}
		System.out.println(i);
	}
}