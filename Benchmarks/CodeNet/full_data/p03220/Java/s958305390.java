import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int A = in.nextInt();
		
		int ans = 0;
		double min = 100000;
		
		for(int i=1; i<=N; i++) {
			double sub = Math.abs(A -  (T - in.nextInt() * 0.006));
			if(sub < min) {
				min = sub;
				ans = i;
			}
		}
		
	
		System.out.println(ans);
		
		in.close();
	}
}
