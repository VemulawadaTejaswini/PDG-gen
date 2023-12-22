import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int A[][]=new int[N][2];
		long key=0;
		for(int i=0;i<N;i++){
			A[i][0]=stdIn.nextInt();
			A[i][1]=stdIn.nextInt();
		}
		Arrays.sort(A, (a, b) -> Integer.compare(a[0], b[0]));
		for(int i=0;i<N;i++){
			key+=A[i][1];
			if(key>=K){
				System.out.println(A[i][0]);
				break;
			}
		}
	}
}