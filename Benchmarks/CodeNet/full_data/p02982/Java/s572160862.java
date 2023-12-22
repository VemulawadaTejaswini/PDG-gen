
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		int [][]arr=new int[n][d];
		for(int i=0;i<n;i++) {
			for(int j=0;j<d;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int k=i+1;k<n;k++) {
				long x=0;
				for(int j=0;j<d;j++) {
					x+=Math.pow(arr[k][j]-arr[i][j],2);
				}
				long y=(long)Math.sqrt(x);
				if(y*y==x) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
