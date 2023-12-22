import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; i++){
			arr[i] = sc.nextInt();
		}

		int[] sorted = new int[n];

		for(int i=1; i<=n; i++){
			for(int j=1, k=1; j<=n; j++){	
				if(i != j){
					sorted[k++] = arr[j];
				}
			}
			Arrays.sort(sorted);
			System.out.println(sorted[(n)/2]);
		}
	}
}
