//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int A[] = new int[N];
		int souwa = 0;
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			souwa+=A[i];
		}
		//System.out.println(souwa);
		if(H<=souwa) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
