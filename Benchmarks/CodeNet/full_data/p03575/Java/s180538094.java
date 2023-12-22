import java.util.Scanner;

public class Main {
	Scanner scan;
	int n;
	int m;

	int[] a;
	int[] b;

	boolean[] judge;
	int count;
	boolean[][] connect;

	public static void main(String args[]){
		new Main().compute();
	}
	void compute() {
		scan=new Scanner(System.in);

		n=scan.nextInt();
		m=scan.nextInt();

		a=new int[m];
		b=new int[m];

		for(int i=0;i<m;i++) {
			a[i]=scan.nextInt();
			b[i]=scan.nextInt();
		}
		judge=new boolean[n];
		count=0;
		connect=new boolean[n][n];


		for(int i=0;i<m;i++) {
			connect[a[i]-1][b[i]-1]=true;
			connect[b[i]-1][a[i]-1]=true;
		}

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				judge[j]=false;
			}
			connect[a[i]-1][b[i]-1]=false;
			connect[b[i]-1][a[i]-1]=false;
			dfs(0);
			connect[a[i]-1][b[i]-1]=true;
			connect[b[i]-1][a[i]-1]=true;
			for(int j=0;j<n;j++) {
				if(!judge[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
	void dfs(int x) {
		judge[x]=true;
		for(int i=0;i<n;i++) {
			if((connect[x][i])&&(!judge[i])) {
				dfs(i);
			}
		}
	}
}
