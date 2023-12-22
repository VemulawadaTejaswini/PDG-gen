import java.util.Arrays;
import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
		Scanner frog = new Scanner(System.in);
		int N = frog.nextInt();
		int K = 0;
		int[] X = new int[N];
		for(int i = 0 ; i<N;i++)
			X[i]= frog.nextInt();
		 Arrays.sort(X);
		 for(int i =0;i<(N-1);i++) {
			 if(X[i]==X[i+1]) {
				 K++;
				 break;
			 }			 
		 }
	if(K>0)
		System.out.println("NO");
		else
			System.out.println("Yes");
	}   
	}
    