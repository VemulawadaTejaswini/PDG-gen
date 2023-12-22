import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	
	static int GCD(int A, int B) {
		int temp;
		while((temp = A%B) != 0) {
			A = B;
			B = temp;
		}
		return B;
	}
	
	static int gcd(int a, int b, int c) {
		int temp;
		int d = GCD(a,b);
		while((temp = c%d) != 0){
			c = d;
			
			d = temp;
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= K; i++) {
			for(int j = 1; j <= K; j++) {
				for(int k = 1; k <= K; k++) {
					sum += gcd(i,j,k);
				}
			}
		}
		
		System.out.println(sum);
	}

}