import java.*;
import java.util.Scanner;
import java.util.ArrayList;


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
		List = new int[M];
		city = new int[M][4];
		for (int i = 0; i < M; i++) {
			city[i][0] = ss.nextInt();
			city[i][1] = ss.nextInt();	
			city[i][2] = 0;
			city[i][3] =i;
		}
		makesort(city , 1);
		city[0][2]=1;
		for (int i = 0; i < M-1; i++) {
			int count = i+1;
			if(city[count][2]!=0)continue;
			city[count][2]=1;
			int num=1;			
			while (count!=M) {
				if(city[i][0] != city[count][0]) {
					count++;
					continue;
				}
				if(city[i][0] == city[count][0]) {
					num++;
					city[count][2]=num;
					count++;
					continue;
				}
				
			}
		}
		makesort(city , 3);
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
	
	private static void makesort(int[][] s, int x) {
		for (int j = 0; j < M-1; j++) {
			for (int i = 0; i < M - 1-j; i++) {
				int[] ss;
				if (s[i][x]>s[i + 1][x]) {
					ss = s[i];
					s[i] = s[i + 1];
					s[i + 1] = ss;
				} 
			}
		}
		
	}
}
