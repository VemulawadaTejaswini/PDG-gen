import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[m];
		int[] b = new int[m];

		int[][] c = new int[m][n];

		for(int i=0;i<m;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			for(int j=0;j<b[i];j++) {
				c[i][j] = sc.nextInt();
			}
		}

		int[][] d = new int[m][(int) Math.pow(2,n)];
		for(int i=0;i<m;i++) {
			d[i][0]=0;
			for(int j =1;j<Math.pow(2,n);j++) {
				d[i][j]=(int) 1e9;
			}
		}

		int index=0;
		for(int j=0;j<b[0];j++) {
			 index+= Math.pow(2,c[0][j]-1);
		}
		d[0][index]=a[0];

		for(int i =1;i<m;i++) {
			for(int j=0;j<(int) Math.pow(2,n);j++) {
				if(d[i-1][j]<1e9-1) {
					if(d[i][j]>d[i-1][j]) {
						d[i][j]=d[i-1][j];
					}

					int target = j;
					for(int k =0;k<b[i];k++) {
						if(j%Math.pow(2,c[i][k])>=Math.pow(2,c[i][k]-1)) {
						}else {
							target += Math.pow(2,c[i][k]-1);
						}
					}
					if(d[i][target]>d[i-1][j]+a[i])d[i][target]=d[i-1][j]+a[i];

				}
			}

		}
		if( d[m-1][(int) Math.pow(2,n)-1]<1e9) {
			System.out.println( d[m-1][(int) Math.pow(2,n)-1]);
		}else {
			System.out.println(-1);
		}



		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		treeMap.put(b[n], n);
		*/

	}

}