import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int h, w;
	long bl = 0, wh = 0;
	void doIt() {
		h = sc.nextInt();
		w = sc.nextInt();
		String s[] = new String[h];
		long ans = 0;
		for(int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		char c[][] = new char[h][w];
		for(int j = 0; j < w; j++) {
			for(int i = 0; i < h; i++) {
				c[i][j] = s[i].charAt(j);
			}
		}
		for(int j = 0; j < w; j++) {
			for(int i = 0; i < h; i++) {
				if(c[i][j] != '!') {
					change(i, j, c);
					ans += bl * wh;
					bl = 0; wh = 0;
				}
			}
		}
		System.out.println(ans);
	}
	
	void change(int i, int j, char[][] c) {
		if(c[i][j] == '!') return;
		else if(c[i][j] == '#') bl++;
		else if(c[i][j] == '.') wh++;
		char cp = c[i][j];
		c[i][j] = '!';
		//System.out.println(i +" "+ j);
		if(i - 1 >= 0 && cp != c[i - 1][j]) change(i - 1, j, c);
		if(i + 1 < h && cp != c[i + 1][j]) change(i + 1, j, c);
		if(j - 1 >= 0 && cp != c[i][j - 1]) change(i, j - 1, c);
		if(j + 1 < w && cp != c[i][j + 1]) change(i, j + 1, c);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
