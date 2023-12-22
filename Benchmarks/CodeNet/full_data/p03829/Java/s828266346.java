import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		
		//入力値の受け取り
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B =sc.nextInt();
		int X[] = new int[N];
		for(int i=0;i<N;i++)X[i]=sc.nextInt();
		sc.close();
		
		long ans = 0;
		
		for(int i=0;i<N-1;i++) {
			ans += Math.min((X[i+1]-X[i])*A, B);
		}
		
		System.out.println(ans);
	}
	
}