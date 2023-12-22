import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,K;
		String S;
		Scanner sc=new Scanner(System.in);	
		N=sc.nextInt();
		S=sc.next();
		char c[]=S.toCharArray();
		int num=0;
		
		for(int i=1;i<N;i++) {
				
					if(i!=N-1) {
						if(c[i-1]=='#'&&c[i]=='.') {
						c[i-1]='.';
					    i=i-1;
						num++;
						
						
					}
					}
					
					
			}
			
		
			
		System.out.println(num);
	}
}
