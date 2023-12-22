import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int K = sc.nextInt();
			int k = K;
			if(1 <= A && A <= B && B <= 10*10*10*10*10*10*10*10*10)
			{for(; K > 0;K--) {
				if(1 <= A && A <= B) {
				System.out.println(A);
				A++;}
			}
			for(; k > 0;k--) {
				if(1 <= A && A <= B) {
				System.out.println(B);
				B--;}
			}
			}}}