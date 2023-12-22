import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		boolean[][] a = new boolean[h+1][w+1];
		for(int i=0;i<h;i++) {
			String str = in.next();
			for(int j=0;j<w;j++) {
				if(str.charAt(j)=='#') a[i][j] = true;
				a[i][w] = a[i][w]|a[i][j];
				a[h][j] = a[h][j]|a[i][j];
			}
		}
		
		for(int i=0;i<h;i++) {
			if(a[i][w]) {
				String str = "";
				for(int j=0;j<w;j++) {
					if(a[h][j]) str += (a[i][j] ? "#" : ".");
				}
				System.out.println(str);
			}
		}
		in.close();

	}

}
