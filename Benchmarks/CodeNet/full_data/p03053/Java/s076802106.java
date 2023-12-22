import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		boolean[][] a = new boolean[w+2][h+2];
		String s;
		for(i=1;i<=h;i++){
			s = sc.next();
			for(j=1;j<=h;j++){
				if(s.charAt(j-1) == '#') a[i][j] = true;
			}
		}
		sc.close();
		boolean[][] b = new boolean[w+2][h+2];
		char[] kuro = {'#', '$'};
		int cnt = 0;
		boolean loop = true;
		boolean f = false;
		while(loop) {
			for(i=1;i<=w;i++){
				for(j=1;j<=h;j++){
//					System.out.print(a[i][j]);
					if(!(a[i][j])
					&&(a[i][j-1]
					|| a[i][j+1]
					|| a[i-1][j]
					|| a[i+1][j])){
						b[i][j] = true;
						f = true;
					}
				}
//				System.out.println("");
			}
			if(f) {
				cnt++;
				for(i=1;i<=w;i++){
					for(j=1;j<=h;j++){
						a[i][j] |= b[i][j];
					}
				}
			} else {
				loop = false;
			}
			f = false;
		}
		System.out.println(cnt);
	}
}
