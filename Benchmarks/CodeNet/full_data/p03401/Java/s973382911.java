import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			int c = 0;
			int a = 0;
			for(int b=0; b<N+1; b++) {
				if(b == N) {
					c += Math.abs(a-0);
				}
				else if(i != b) {
					c += Math.abs(a-A[b]);
					a = A[b];
				}
			}
			System.out.println(c);
		}
	}

}

