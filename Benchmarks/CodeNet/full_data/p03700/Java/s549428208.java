import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int N;
	static long A,B;
	static Long[] h;

	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		N = io.nextInt();
		A = io.nextLong();
		B = io.nextLong();
		h = new Long[N];
		for (int i = 0; i < N; i++) {
			h[i] = io.nextLong();
		}
		
		Arrays.sort(h,Collections.reverseOrder());
		
		Long ansMin = h[0]/A + ((h[0]%A==0)?0:1)-1;
		Long ansMax = h[0]/B + ((h[0]%B==0)?0:1);
		
		System.out.println(ans(ansMin,ansMax));
		
	}
	
	public static long ans(long min,long max){
		if(max-min<=1) return max;
		long cand = (min+max)/2;
		if(possible(cand,cand,0))
			return ans(min,cand);
		else
			return ans(cand,max);
	}
	
	public static boolean possible(long count,long maxA, int i){
		if(i>=N) return true;
		long num = h[i]-B*(count-maxA);
		if(A*maxA<num) return false;
		if(B*maxA>=num) return true;
		long nextMaxA = (A*maxA-num)/(A-B);
		return possible(count,nextMaxA,i+1);
	}
}