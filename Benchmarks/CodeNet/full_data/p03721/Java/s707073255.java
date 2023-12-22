import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
	
		int[][] arr = new int[n][2];
		long kthIndex = 0;
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			kthIndex += b;
			
			if(kthIndex >= k){
				System.out.println(a);
				break;
			}		
		}
	}
}