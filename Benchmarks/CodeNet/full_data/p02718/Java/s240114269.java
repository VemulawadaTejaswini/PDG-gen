//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int [N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		int sum = 0;
		for(int j=0;j<N;j++) {
			sum += A[j];
		}
		//System.out.println(sum);
		boolean ok[] = new boolean[N];
		Arrays.fill(ok, true);
		for(int k=0;k<N;k++) {
			if(A[k]<sum/(4*M)) {
				ok[k] = false;
			}
		}
		int count = 0;
		for(int l=0;l<N;l++) {
			if(ok[l]) {
				count ++;
			}
		}
		//System.out.println(count);
		if(count>=M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}