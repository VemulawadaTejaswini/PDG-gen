
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int ans = 0;
		
		for(int i=1; i<=N; i=i+2) {
			if(yaku(i) == 8) {
				ans++;
			}
		}
		
		System.out.println(ans);
		in.close();
	}
	
	public static int yaku(int N) {
		int count=0;
		for(int i=1; i<=(int)Math.sqrt(N); i++) {
			if(N%i==0) {
				count += 2;
			}
		}
		return count;
	}
}