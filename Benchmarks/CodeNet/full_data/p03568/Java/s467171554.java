import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), even = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(A % 2 == 0) even++;
		}
		System.out.println((int)Math.pow(3, N) - (1 << even));
	}
}