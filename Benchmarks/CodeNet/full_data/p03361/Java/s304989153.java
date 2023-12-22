import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] ch = new char[h+2][w+2];
		for (int i = 0; i < h+2; i++) {
			if (i == 0 || i == h+1) {
				for (int j = 0; j < w+2; j++) {
					ch[i][j] = '$';
				}
			}
			else {
				String a = sc.next();
				for (int j = 0; j < w+2; j++) {
					if (j == 0 || j == w+1) {
						ch[i][j] = '$';
					} else {
						
					}
					ch[i][j] = a.charAt(j-1);
				}
			}
		}
		
		for (int i = 1; i < h+1; i++) {
			for (int j = 1; j < w+1; j++) {
				if (ch[i][j] == '$' || ch[i][j] == '.') continue;
				else {
					if (ch[i-1][j] == '#' || ch[i][j-1] == '#' || ch[i][j+1] == '#' || ch[i+1][j] == '#') continue;
					else {
						System.out.println("No");
					}
				}
			}
		}
		System.out.println("Yes");
	}
}