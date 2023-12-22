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
			
			for(int i = 0;i<N;i++) {
				if(goukei%10==0) {
					goukei-=s[i];
				}
				
				if(goukei%10!=0) {
					break;
				}
			}
			
			
			System.out.println(goukei);
			
			
		
			
		}
		
		
	}
		

}
