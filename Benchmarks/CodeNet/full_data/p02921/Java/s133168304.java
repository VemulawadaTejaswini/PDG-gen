import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		//int ans = 0;
		int clc = 0;

		clc = B/A+1;
		if(B==A) {
			clc= clc-1;
		}
		if(A==1&&B==1)clc = 0;
		System.out.println(clc);


	}

}
