import java.util.Scanner;

public class Main{

	static Scanner s = new Scanner(System.in);

	public static void main(String __[]){
		input();
		solve();
	}

	static int h, w, n, k, f[][];

	private static void input(){
		h = s.nextInt();
		w = s.nextInt();
		n = s.nextInt();
		k = s.nextInt();
		f = new int[h][w];
	}

	private static void solve(){
		int count=n;
		loop:
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(i==h-1&&j==w-1) {
					f[i][j]=count;
					break loop;
				}

				f[i][j] = question(i, j, i, j);
				count-=f[i][j];
				if(count==0) break loop;
			}
		}

		long pow = 1, result = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				result += f[i][j] * pow;
				result %= k;
				pow *= 2;
				pow %= k;
			}
		}

		answer(result);
	}

	private static final int question(int x1, int y1, int x2, int y2){
		System.out.printf("? %d %d %d %d\n", x1, y1, x2, y2);
		return s.nextInt();
	}

	private static final void answer(long a){
		System.out.printf("! %d\n", a);
	}
}
