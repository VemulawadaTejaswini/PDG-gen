package A;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan = new Scanner(System.in);
		int K = scan.nextInt();
		scan = new Scanner(System.in);
		int X = scan.nextInt();
		scan = new Scanner(System.in);
		int Y = scan.nextInt();
		
		int Hi = N - K;
		int Yen;
		
		if (Hi > 0){
			Yen = K * X;
			Yen = Yen + (Hi * Y);
			System.out.println(Yen);
		}
		else{
			Yen = N * X;
			System.out.println(Yen);
		}
	}

}