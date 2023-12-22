import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = keta(N);
		for(long i = 1;i < N / 2;i++){
			if(N % i == 0){
				ans = Math.min(ans,F(N / i,i));
			}
		}
		System.out.println(ans);
	}
	public static int F(long a,long b){
		return Math.max(keta(a),keta(b));
	}
	public static int keta(long a){
		int count = 1;
		long buf = a;
		while(buf / 10 != 0){
			count++;
			buf = buf / 10;
		}
		return count;
	}
}