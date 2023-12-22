import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max  = 0;
		int [] A = new int[N];
		for(int i=0;i<N;i++) {
		A[i]=sc.nextInt();
			if(i!=0) {
				int temp;
				while((temp = A[i]%A[i-1])!=0) {
					A[i] = A[i-1];
					A[i-1] = temp;
				}
				max = Math.max(A[i-1], max);
			}
		}
		sc.close();
		System.out.print(max);
	}
}