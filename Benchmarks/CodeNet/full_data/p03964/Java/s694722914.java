import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		long A = 1L,B = 1L;
		for(int i = 0; i < N; ++i){
			long x = sn.nextLong();
			long y = sn.nextLong();
			double A_x = (double)A/(double)x;
			double B_y = (double)B/(double)y;
			long n = (long)Math.max(Math.ceil(A_x),Math.ceil(B_y));
			A = n*x;
			B = n*y;			
		}
		System.out.println(A+B);
	}
}
