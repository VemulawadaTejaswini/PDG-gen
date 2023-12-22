import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		char a[][] = new char[h][w];

		for (int i = 0;i<h ;i++ ) {
				String temp = sc.next();
			for (int j = 0;j<w ;j++ ) {
				a[i][j] = temp.charAt(j);
			}
		}

		for (int j = 0;j<w ;j++ ) {
			int count = 0;
			for (int i = 0;i<h ;i++ ) {
				if (a[i][j]=='#') {
				}else{
					count++;
				}
			}
			if (count==h) {
				for (int k = 0;k<h ;k++ ) {
					a[k][j] = ' ';
				}
			}
	}

	for (int i = 0;i<h ;i++ ) {
		int count = 0;
		for (int j = 0;j<w ;j++ ) {
			if (a[i][j]==' '||a[i][j]=='.') {
				count++;
			}
		}
		if (count==w) {
			for (int k = 0;k<w ;k++ ) {
				a[i][k] = ' ';
			}
		}
}

		for (int i = 0;i<h ;i++ ) {
			int count =0;
			for (int t = 0;t<w ;t++ ) {
				if (a[i][t]==' ') {
				}else{
					System.out.print(a[i][t]);
					count++;
				}
			}
			if (count>0) {
				System.out.println();
			}
		}


	}
}
