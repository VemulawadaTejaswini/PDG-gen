import java.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Main{
	static int N,M;
	static int[] List;
	static int[][] city;
	static int[] Answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		M = ss.nextInt();
		List = new int[N+1];
		city = new int[M][4];
		for (int i = 0; i < M; i++) {
			city[i][0] = ss.nextInt();
			city[i][1] = ss.nextInt();	
			city[i][2] = 1;
			city[i][3] =i;
		}
		RandomQuickSort(city,0, M-1 , 1);
		
		for (int i = 0; i < M; i++) {
			List[city[i][0]]++;
			city[i][2] = List[city[i][0]];
		}
		RandomQuickSort(city, 0, M-1, 3);
		for (int i = 0; i < M; i++) {
			String aa = Integer.toString(city[i][0]);
			int len = aa.length();
			int n = 6-len;
			for (int j = 0; j < n; j++) {
				System.out.print("0");
			}
			System.out.print(city[i][0]);
			String bb = Integer.toString(city[i][2]);
			int len1 = bb.length();
			int n1 = 6-len1;
			for (int j = 0; j < n1; j++) {
				System.out.print("0");
			}
			System.out.print(city[i][2]);
			System.out.println();

		}
		
	}
	public static void RandomQuickSort(int[][] s, int left, int right, int x) {
	    if (left < right) {
	        int p = randomPartition(s, left, right, x);
	        RandomQuickSort(s, left, p - 1, x);
	        RandomQuickSort(s, p + 1, right, x);
	    }
	}
	public static int randomPartition(int[][] s, int left, int right, int x) {
		Random random = new Random();
	    int r = random.nextInt(right - left) + left; 
	    swap(s, right, r);
	    return partition(s, left, right, x);
	}
	
	private static int partition(int[][] a, int left, int right, int x) {
	    int p = left - 1;
	    for (int i = left; i < right; i++) {
	        if (a[i][x] <= a[right][x]) {
	            p++;
	            swap(a, p, i);
	        }
	    }
	    swap(a, p+1, right);
	    return p+1;
	}
	
	private static void swap(int[][] a, int i, int j) {
	    int[] temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
}