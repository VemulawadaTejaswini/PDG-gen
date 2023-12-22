
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a[][] = new int[h][w];
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				a[i][j]=sc.nextInt();
			}
		}

		int s[][] = new int[500*500][4];
		int cnt = 0;
		for(int i=0; i<h-1; i++) {
			for(int j=0; j<w; j++) {
				if(a[i][j] % 2 != 0) {
					a[i][j]--;
					a[i+1][j]++;
					s[cnt][0] = i+1;
					s[cnt][1] = j+1;
					s[cnt][2] = i+2;
					s[cnt][3] = j+1;
					cnt++;
				}
			}
		}
		for(int j=0; j<w-1; j++) {
			if(a[h-1][j] % 2 != 0) {
				a[h-1][j]--;
				a[h-1][j+1]++;
				s[cnt][0] = h;
				s[cnt][1] = j+1;
				s[cnt][2] = h;
				s[cnt][3] = j+2;
				cnt++;
			}
		}

		System.out.println(cnt);
		for(int i=0; i<cnt; i++) {
			System.out.println(s[i][0] + " " + s[i][1] + " " + s[i][2] + " " + s[i][3]);
		}
		sc.close();
	}


}


