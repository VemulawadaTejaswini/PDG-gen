import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int L=sc.nextInt();
		String[] S=new String[L];
		
		for(int i=0;i<N;i++) {
			S[i]=sc.next();
		}
				
		Arrays.sort(S);
		
		final StringBuilder sb = new java.lang.StringBuilder();
		
		for (final String item : S) {
			sb.append(item);
		}
		
		System.out.print(sb);
		
		sc.close();
	}
}
