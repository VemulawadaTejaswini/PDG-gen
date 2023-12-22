import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[][] x=new int[n][2];
		
		for(int i=0;i<n;i++) {
			x[i][0] = sc.nextInt();
			x[i][1] = i+1;
		}
		sort(x,n);
		for(int i=0;i<n;i++) {
			System.out.print(x[i][1]+" ");
		}
	}
	public static void sort(int[][] x,int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(x[j][0]>x[j+1][0]) {
					int temp = x[j][0];
					x[j][0] = x[j+1][0];
					x[j+1][0] = temp;
					
					temp = x[j][1];
					x[j][1] = x[j+1][1];
					x[j+1][1] = temp;
				}
			}
		}
	}
}
