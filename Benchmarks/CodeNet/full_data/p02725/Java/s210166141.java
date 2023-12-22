
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
//		int total = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		int start = in.nextInt();
//		total += start;
		int[][] map = new int[n][n];
		map[0][0]=0;
		int[] sum = new int[n];
		for(int i=0; i<n-1; i++) {
			int a = in.nextInt();
			list.add(a-start);
//			total = a;
			map[0][i+1] = Math.min(a-start, k-a+start);
			map[i+1][0] = Math.min(a-start, k-a+start);
			sum[0] += map[0][i+1];
			sum[i+1] += map[i+1][0];
//			System.out.print(list.get(i)+ " ");
		}
//		System.out.println(list.get(n-1));
//		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println("");
//		}
//		
//		int[][] map = new int[n][n];
		for(int i=1; i<n; i++) {
			for(int j=1; j<n; j++) {
				if(i>j) {
					map[i][j]=map[j][i];
					sum[i]+=map[i][j];
					continue;
				}
				else if(i==j) {
					map[i][j]=0;
					continue;
				}else {
					map[i][j] = Math.min(list.get(j)-list.get(i), k-(list.get(j)-list.get(i)));
					sum[i]+=map[i][j];
				}
			}
//			System.out.print(sum[i]+" ");
			
		}
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println("");
//		}
//		System.out.println(list.get(n-2));
//		list.add(k-total+start);
//		System.out.println(list.get(n-1));
//		list.set(n-1, p+start);
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			min = Math.min(min, sum[i]);
		}
		
		System.out.println(min);
	}
	
}