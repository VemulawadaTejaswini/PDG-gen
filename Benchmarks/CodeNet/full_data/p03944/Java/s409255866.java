
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		
		int ret = 0;
		
		int[] xi = new int[n];
		int[] yi = new int[n];
		int[] ai = new int[n];
		
		for( int i = 0 ; i < n ; i++  ) {
			xi[i] = sc.nextInt();
			yi[i] = sc.nextInt();
			ai[i] = sc.nextInt();
		}
		
		
		ret = w*h;
		for( int y = 0 ; y < h ; y++  ) {
			for( int x = 0 ; x < w ; x++  ) {
				boolean isPainted = extracted(n, xi, yi, ai, y, x);
				if( isPainted )
					ret--;
			}
		}
		
		System.out.println(ret);
	}

	private static boolean extracted(int n, int[] xi, int[] yi, int[] ai, int y, int x) {
		boolean isPainted = false;
		for( int i=0 ; i < n ; i++ ) {
			int xii = xi[i];
			int yii = yi[i];
			int aii = ai[i];
			switch(aii) {
			case 1:
				if( x < xii ) return true;
				break;
			case 2:
				if( x >= xii ) return true;
				break;
			case 3:
				if( y < yii ) return true;
				break;
			case 4:
				if( y >= yii ) return true;
				break;
			}
		}
		return isPainted;
	}
}