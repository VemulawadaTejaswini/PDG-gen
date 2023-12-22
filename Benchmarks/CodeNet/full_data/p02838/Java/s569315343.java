import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		long[] ary=new long[nn];
		long sum = 0;
		int mod=1000000007;
		
		for (int i=0;i<nn;i++){
			ary[i] = sc.nextLong();
			for (int j=0;j<i;j++){
				sum = (long)(sum + (ary[i]^ary[j]))%mod;
			}
		}
		System.out.print(sum);
	}
}