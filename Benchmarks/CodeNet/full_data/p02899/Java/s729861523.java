import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[][]=new int[N][2];
		for(int i=0;i<N;i++){
			int b=stdIn.nextInt();
			A[i][0]=b;
			A[i][1]=i+1;
		}
		Arrays.sort(A, (a, b) -> Long.compare(a[0], b[0]));
		for(int i=0;i<N;i++){
			System.out.println(A[i][1]);
		}
	}
}
