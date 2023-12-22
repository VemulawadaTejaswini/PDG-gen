
import java.util.Scanner;


public class Main {
	static long A,B;
	static int K;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 A = sc.nextLong();
			 B = sc.nextLong();
			 K = sc.nextInt();
		sc.close();

		for(int i = 0 ; i < K/2 ; i++){
			if(A%2 != 0){
				A -= 1;
				B += A/2;
				A = A/2;
			}
			else{
				B += A/2;
				A = A/2;
			}

			//System.out.println(A + " " + B);
			if(B%2 != 0){
				B -= 1;
				A += B/2;
				B = B/2;
			}
			else{
				A += B/2;
				B = B/2;
			}
			//System.out.println(A + " " + B);
		}

		if(K%2 != 0){
			if(A%2 != 0){
				A -= 1;
				B += A/2;
				A = A/2;
			}
			else{
				B += A/2;
				A = A/2;
			}
			//System.out.println(A + " " + B);
		}
		System.out.println(A + " " + B);
	}
}