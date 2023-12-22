import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			int[]A = new int [N];
			for(int i = 0;i<N;i++)A[i] = scan.nextInt();
			long goukei = 0;
			
			for(int i = 0;i<N-1;i++) {
				if(i==N-2&&(-A[i]-A[i+1]>A[i]+A[i+1])) {
					A[i]*=-1;
					A[i+1]*=-1;
				}else if((A[i]<=0&&A[i+1]<=0)||(A[i]<0&&A[i+1]>0)) {//0が含むーはこちらで処理00 0- -0　
					A[i]*=-1;
					A[i+1]*=-1;
				}
				
				
				
				
				
				
			}
			
			
			for(int i:A) {
				goukei+=(long)i;
			}
			
			System.out.println(goukei);
			
			
		}
	}
}
