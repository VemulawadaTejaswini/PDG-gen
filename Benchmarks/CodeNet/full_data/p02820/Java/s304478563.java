import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int R = scan.nextInt();
			int S = scan.nextInt();
			int P = scan.nextInt();
			String T = scan.next();//|T| = N
			char[] t = new char[N];
			char[] dasita = new char[N];
			t = T.toCharArray();
			long goukei = 0;
			
			for(int i = 0;i<N;i++) {
				if(i<=K-1){
					if(t[i]=='r') {
						goukei+=P;dasita[i]='p';
					}
					if(t[i]=='s') {
						goukei+=R;dasita[i]='r';
					}
					if(t[i]=='p') {
						goukei+=S;dasita[i]='s';
					}	
				}else{
					if(t[i]=='r') {
						if(dasita[i-K]=='p') {
						dasita[i]='r';	
						}else {
						goukei+=P;dasita[i]='p';
						}
					}
					if(t[i]=='s') {
						if(dasita[i-K]=='r') {
							dasita[i]='s';	
							}else {
							goukei+=R;dasita[i]='r';
							}
					}
					if(t[i]=='p') {
						if(dasita[i-K]=='s') {
							dasita[i]='p';	
							}else {
							goukei+=S;dasita[i]='s';
							}
					}	
					
				}
				
				//System.out.println(dasita[i]);
			}
			
			
			
			System.out.println(goukei);
			
		}
		
		
	}
		

}
