import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int s = 0;
		sc.close();
		if(A>=B && A>=C) {
			s = B+C;
		}else if(B>=A && B>=C) {
			s = A+C;
		}else {
			s = A+B;
		}
		System.out.println(s);
	}

}