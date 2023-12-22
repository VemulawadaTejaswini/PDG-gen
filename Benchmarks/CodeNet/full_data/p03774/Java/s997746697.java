import java.util.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[m];
		int[] d = new int[m];
		int[][] distance = new int[n][m];
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		int[] min = new int[n];
		for (int i = 0; i < n; i++) {
			min[i] = Math.abs(a[i] - c[i]) + Math.abs(b[i] - d[i]);
			for (int j = 0; j < m; j++) {
				distance[i][j] = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
				min[i] = Math.min(min[i], distance[i][j]);
				//System.out.println(distance[i][j]);
			}
			//System.out.println("min : " + min[i]);
			
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(min[i] == distance[i][j]) {
					result[i] = j + 1;
					break;
				}
			}
			System.out.println(result[i]);
		}
		
		  
	}

}