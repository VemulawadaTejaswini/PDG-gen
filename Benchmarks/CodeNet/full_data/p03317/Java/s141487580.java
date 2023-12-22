import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int K = scan.nextInt();
			int []A = new int[N];
			int onenum = 0;
			int goukei = 0;
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				if(A[i]==1)onenum = i;
			}
			
			int migi = N-1-onenum;
			int hidari = onenum-0;
			
			if(migi/(K-1)!=0) {
				if(migi%(K-1)!=0)goukei+=migi/(K-1)+1;
				else goukei+=migi/(K-1);
			}
			
			if(hidari/(K-1)!=0) {
				if(hidari%(K-1)!=0)goukei+=hidari/(K-1)+1;
				else goukei+=hidari/(K-1);
			}
			
			System.out.println(goukei);
			
			
		}
		
		
	}
		

}
