import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[2][n];
		int max=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int buff=0;
			for(int j=0;j<=i;j++) {
				buff+=a[0][j];
			}
			for(int j=i;j<n;j++) {
				buff+=a[1][j];
			}
			max=Math.max(max, buff);
		}
		System.out.println(max);
	}
}

