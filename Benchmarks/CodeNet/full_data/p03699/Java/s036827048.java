import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[] s = new int[N];
			int goukei = 0;
			for(int i = 0;i<N;i++) {
				s[i] = scan.nextInt();
				goukei+=s[i];
			
			}
			
			Arrays.sort(s);
			
			if(goukei%10!=0) {
				System.out.println(goukei);
			}else {
				
			}
				
			int ans = 0;
			
			for(int i = 0;i<N;i++) {
				int go = goukei;
				if(go%10==0) {
					go-=s[i];
				}
				
				if(go%10!=0) {
					ans = go;
					break;
				}
				
				if(i==N-1&&go%10==0) {
					ans = 0;
					break;
				}
			}
			
			
			System.out.println(ans);
			
			
		
			
		}
		
		
	}
		

}
