import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int c[][] = new int[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				c[i][j]=sc.nextInt();
			}
		}

		for(int k=0; k<10; k++) {
			for(int i=0; i<10; i++) {
				if(c[i][k]==-1)continue;
				for(int j=0; j<10; j++) {
					if(c[k][j]==-1)continue;
					c[i][j] = Math.min(c[i][j], c[i][k]+c[k][j]);
				}
			}
		}

		int a[][] = new int[h][w];
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		long ans = 0;
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(a[i][j]==-1)continue;
				if(a[i][j]==1)continue;
				ans += c[a[i][j]][1];
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
