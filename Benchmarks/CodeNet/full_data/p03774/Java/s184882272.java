import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[m];
		int[] d = new int[m];
		int min = 99999999, minindex = 0;
		
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]) < min){
					min = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
					minindex = j;
				}
			}
			System.out.println(minindex + 1);
			min = 999999; 
			minindex = 0;
		}
	}
}
