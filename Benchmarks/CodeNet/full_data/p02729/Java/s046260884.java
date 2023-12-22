import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int N = inputs.nextInt();
		int M = inputs.nextInt();
		int sum = 0;
		if(N>=2) {
			sum+=comb(N,2);
		}
		if(M>=2) {
			sum+=comb(M,2);
		}
		System.out.println(sum);
	}
	static int comb(int n , int r)
	{
		if( r== 0 || n == r)
			return 1;
		else
			return comb(n-1,r)+comb(n-1,r-1);
	}
}
