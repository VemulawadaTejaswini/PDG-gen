import java.util.Scanner;

public class Main {
	static long MIN = Long.MIN_VALUE;
	static int N,A,B;
	static int[] h;

	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		N = io.nextInt();
		A = io.nextInt();
		B = io.nextInt();
		h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = io.nextInt();
		}
		
		int ansMin = h[0]/A + ((h[0]%A==0)?0:1)-1;
		int ansMax = h[0]/B + ((h[0]%B==0)?0:1);
		
		System.out.println(ans(ansMin,ansMax));
		
	}
	
	public static int ans(int min,int max){
		if(max-min<=1) return max;
		int cand = (min+max)/2;
		if(possible(cand,cand,0))
			return ans(min,cand);
		else
			return ans(cand,max);
	}
	
	public static boolean possible(int count,int maxA, int i){
		if(i>=N) return true;
		int num = h[i]-B*(count-maxA);
		if(A*maxA<num) return false;
		if(B*maxA>=num) return true;
		int nextMaxA = (A*maxA-num)/(A-B);
		return possible(count,nextMaxA,i+1);
	}
}