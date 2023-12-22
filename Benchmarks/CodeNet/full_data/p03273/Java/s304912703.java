import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean bh[] = new boolean[h];
		boolean bw[] = new boolean[w];
		char[][] a = new char[h][w];
		String[] s = new String[h];
		for(int i = 0; i < h; i++) {
			s[i] = sc.next();
			a[i] = s[i].toCharArray();
		}
		
		for(int i = 0; i < h; i++) {
			bh[i] = false;
			for(int j = 0; j < w; j++) {
				if(a[i][j] == '#') {
					bh[i] = true;
					break;
				}
			}
		}
		for(int i = 0; i < w; i++) {
			bw[i] = false;
			for(int j = 0; j < h; j++) {
				if(a[j][i] == '#') {
					bw[i] = true;
					break;
				}
			}
		}
		for(int i = 0; i < h; i++) {
			if(bh[i]) {
				for(int j = 0; j < w; j++) {
					if(bw[j])
						System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	}
}