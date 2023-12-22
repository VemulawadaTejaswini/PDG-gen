import java.util.Arrays;
import java.util.Scanner;

class A implements Comparable<A>{
	int a;
	int b;
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public int compareTo(A o) {
		if(this.a < o.a) {
			return -1;
		}else if(this.a > o.a) {
			return 1;
		}else {
			return 0;			
		}
	}
	
}


public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		A []c = new A[n];
		
		long cnt = 0;
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			c[i] = new A(a,b);
			
			}
			
		Arrays.parallelSort(c);
		
		for(int i = 0; i < n; i++) {
			
			cnt += c[i].b;
			if(cnt >= k) {
				System.out.println(c[i].a);
				return;
			}
			
			
		
		
		
			
		}
		
		
	}

}
