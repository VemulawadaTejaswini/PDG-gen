import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

		int[] arr = new int[n+1];

		for(int i=0; i<m; i++){
			int val = sc.nextInt();
			arr[val]++;
		}
		
		int minCost = n+1;
		int cost = 0;

		for(int i=x+1; i<n; i++){
			if(arr[i] > 0){
				cost++;
			}
		}

		if(minCost > cost){
			minCost = cost;
		}

		cost = 0;

		for(int i=x-1; i>0; i--){
			if(arr[i] > 0){
				cost++;
			}
		}

		if(minCost > cost){
			minCost = cost;
		}	

		System.out.println(minCost);
	}
}
