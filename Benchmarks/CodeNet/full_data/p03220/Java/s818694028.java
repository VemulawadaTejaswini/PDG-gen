import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt()*1000;
		int A = sc.nextInt()*1000;
		int[] H = new int[N];
		int[] t = new int[N];
		int ans = 0;
		for(int i=0; i<N; i++){
			H[i] = sc.nextInt();
			t[i] = T - H[i]*6;
			if(Math.abs(t[i]-A)<Math.abs(t[ans]-A)){
				ans = i;
			}
		}
		System.out.println(ans+1);
		return;
	}
}
