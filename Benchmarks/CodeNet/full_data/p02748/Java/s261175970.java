import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int A = sc.nextInt();
	   int B = sc.nextInt();
	   int M = sc.nextInt();
	   
		Integer a[] = new Integer[A];
		for (int i=0; i<A; i++) {
			a[i] = sc.nextInt();
		}
		Integer b[] = new Integer[B];
		for (int i=0; i<B; i++) {
			b[i] = sc.nextInt();
		}
		Integer x[] = new Integer[M];
		Integer y[] = new Integer[M];
		Integer c[] = new Integer[M];
		
		for(int j=0; j < M; j++) {
			x[j] = sc.nextInt();
			y[j] = sc.nextInt();
			c[j] = sc.nextInt();
		}
		int sum = 100;
		
		for(int k=0; k < M; k++) {
			int e = a[x[k]-1] + b[y[k]-1] - c[k];
			if(sum > e) {
				sum = sum -sum + e;
			}
		}
		System.out.println(sum);
	   
	   
	   }
}

