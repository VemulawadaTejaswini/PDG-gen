
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		
		long X[] = new long[N];
		for(int i=0;i<N;i++)X[i]=0;//initialized
		
		for(int i=0;i<N;i++){
			if(i%2==0) X[0]+=A[i];
			else X[0]-=A[i]; 
		}
		for(int i=1;i<N;i++){
			X[i]=(long)2*A[i-1]-X[i-1];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			sb.append(X[i]+ " ");
		}
		System.out.println(sb.toString());
	}
}
