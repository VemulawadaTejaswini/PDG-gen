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
		}
		
		for(int i=0;i<nn-1;i++){
			for(int j=i+1;j<nn;j++){
				sum = (long)(sum + (ary[i]^ary[j]))%mod;
			}
		}
		
		
		System.out.print(sum);
	}
}