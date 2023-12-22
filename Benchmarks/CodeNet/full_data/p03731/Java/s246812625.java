import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int T = scan.nextInt();
			int []t  = new int[N];
			for(int i  = 0;i<N;i++)t[i] = scan.nextInt();
			int goukei = 0;
			
			for(int i = 0;i<N-1;i++) {
				int s = t[i+1]-t[i];
				if(s<T) {
					goukei+=s;
				}else {
					goukei+=T;
				}
			}
			
			goukei+=T;
			
			System.out.println(goukei);
			
			
		}
		
		
	}
		

}
