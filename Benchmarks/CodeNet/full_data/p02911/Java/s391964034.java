import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int Q=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=0;
		}
		for(int i=0;i<Q;i++) {
			A[scan.nextInt()-1]+=1;
		}
		scan.close();

		for(int i=0;i<n;i++) {
			if(k-Q+A[i]>=1)System.out.println("Yes");
			else System.out.println("No");
		}
	}
}