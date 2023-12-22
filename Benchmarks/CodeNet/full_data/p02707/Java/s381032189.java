import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long[] A = new long[n];
		long[] ANS = new long[n];
		ANS[n-1]=0;	

		for (int i = 0; i < n-1; i++)
			A[i]= sc.nextInt();
		
		for (int i = 0; i < n-1; i++)
			ANS[(int) (A[i]-1)]++;	

		for (int i = 0; i < n; i++) 
		System.out.println(ANS[i]);
      
		sc.close();
	}
}