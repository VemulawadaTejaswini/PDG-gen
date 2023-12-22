
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int w = sc.nextInt();
		long[][]a = input(n , 2 );
		//long[][] dp = new long[n][w];
		for(int i = 0 ;i < n;i++)map.put(i , new TreeMap<>());
		long ans = find( a  , n ,0 , w);
		System.out.println(ans);

		
	}
	static 	TreeMap<Integer , TreeMap<Long , Long>> map =new TreeMap<>(); 

	private static long find( long[][] a, int n, int i , long cap) {
		if(i==a.length || cap==0)return 0 ;
		if(map.get(i).containsKey(cap))return map.get(i).get(cap);
		long ans =find(a , n , i+1 , cap) ;
		if(cap >= a[i][0]) {
			ans = Math.max(ans, find( a ,n,i+1 , cap-a[i][0])+a[i][1]);
		}
		map.get(i).put(cap, ans);
		return ans;
		
	}
	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}
	public static long[][] input(int n , int m ) throws Exception {

		long[][] arr = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
