import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(),W = sc.nextInt();
		char[][] ary = new char[H][W];
		for(int i = 0; i < H; i++) {
			ary[i] = sc.next().toCharArray();
		}

		for (int i = 0; i < H; i++){
			for (int n = 0; n < W; n++) {
				if(ary[i][n] == '#') {
					System.out.print('#');
					continue;
				}
				int count = 0;
				if(i > 0) {
					if(n > 0 && ary[i-1][n-1] == '#') count++;
					if(ary[i-1][n] == '#') count++;
					if(n+1 < W && ary[i-1][n+1] == '#') count++;
				}

				if(n > 0  && ary[i][n-1] == '#') count++;
				if(n+1 < W && ary[i][n+1] == '#') count++;

				if(i+1 < H) {
					if(n > 0 && ary[i+1][n-1] == '#') count++;
					if(ary[i+1][n] == '#') count++;
					if(n+1 < W && ary[i+1][n+1] == '#') count++;
				}
				System.out.print(count);
			}
			System.out.println();
		}
	}
}
