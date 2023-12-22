//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  =sc.nextInt();
		int P[] = new int[N];
		for(int i=0;i<N;i++) {
			P[i] = sc.nextInt();
		}
		int ok = 0;
		int count = 1;
		for(int j=1;j<N;j++) {
			ok = Math.max(P[j-1],P[j]);
			if(ok==P[j-1]) {
				count ++;
			}
		}
		System.out.println(count);

			
	}
}