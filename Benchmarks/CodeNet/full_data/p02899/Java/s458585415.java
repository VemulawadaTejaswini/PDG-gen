import java.util.*;
import java.io.*;

public class Main{

	
	public static void main(String[] args){
	
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		//int K = stdIn.nextInt();
		//int ans = 0;
		int[] A = new int[N];
		int[] ans = new int[N];

		for(int i = 0;i < N;i++){
			A[i] = stdIn.nextInt() - 1;
			ans[A[i]] = i + 1;
		}

		
		for(int i = 0;i < N;i++){
			System.out.print(ans[i] + " ");
		}
	}
}