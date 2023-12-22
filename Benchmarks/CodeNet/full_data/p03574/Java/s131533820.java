import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = Integer.parseInt(scan.next());
		int w = Integer.parseInt(scan.next());
		System.out.println("");
		char[][] str = new char[h][w];
		for(int i=0; i<h; ++i) {
			String s = scan.next();
			for(int j=0; j<w; ++j) {
				str[i][j] = s.charAt(j);
			}
		}
		scan.close();

		for(int i=0; i<h; ++i) {
			for(int j=0; j<w;++j) {
				if(str[i][j] == '#') {
					System.out.print('#');
				} else {
					int bobNum = search(str, i, j, h, w);
					System.out.print(bobNum);
				}

			}
			System.out.println("");
		}
	}

	public static int search(char[][] str, int i, int j, int h, int w) {
		int bobNum = 0;
		for(int a=i-1; a <= i+1; ++a) {
			for(int b=j-1; b<=j+1; ++b) {
				if((0<= a && a<=h-1) && (0<= b && b<=w-1)) {
					char mas = str[a][b];
					if(mas == '#') {
						++bobNum;
					}
				}

			}
		}
		return bobNum;
	}

}