import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;



public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] ar = new int [N][3];
		int [][] con = new int [N-1][2];
		int []c = new int[N];
		for(int i = 0; i< N-1; i++) {
			ar[i][0] = i;
			ar[i][1] = 0;
			ar[i][2] = 0;
			con[i][0] = sc.nextInt() -1;
			con[i][1] = sc.nextInt() -1;
		}
		ar[N-1][0] = N-1;
		ar[N-1][1] = 0;
		ar[N-1][2] = 0;
		
		for(int i = 0; i< N-1; i++) {
			c[i] = sc.nextInt();
			ar[con[i][0]][2]++;
			ar[con[i][1]][2]++;
		}
		c[N-1] = sc.nextInt();

		Arrays.sort(c);
		Arrays.sort(ar, new Comparator<int[]>() { //double[]でコンパレーターを実装する
			  public int compare(int[] a,int[] b) {
			    if(a[2] > b[2]) {
			      return 1;
			    }else if (a[2] == b[2]) {
			      return 0;
			    }else {
			      return -1;
			  }}});
		for(int i = 0; i< N-1; i++) {
			ar[i][1] = c[i];
		}
		Arrays.sort(ar, new Comparator<int[]>() { //double[]でコンパレーターを実装する
			  public int compare(int[] a,int[] b) {
			    if(a[0] > b[0]) {
			      return 1;
			    }else if (a[0] == b[0]) {
			      return 0;
			    }else {
			      return -1;
			  }}});
		for(int i = 0; i< N; i++) {

			ar[N-1-i][1] = c[i];
		}
		int sum = 0;
		for(int i = 0; i< N-1; i++) {
			sum += Math.min(ar[con[i][0]][1],ar[con[i][1]][1]);
		}
		System.out.println(sum);
		for(int i = 0; i< N; i++) {
			System.out.print(ar[i][1] + " ");
		}

	}
}	

