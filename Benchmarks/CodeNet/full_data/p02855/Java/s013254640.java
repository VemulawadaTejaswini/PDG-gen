import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt(), W = scn.nextInt(), K = scn.nextInt();
		char[][] cake = new char[H][W];
		int[][] cake_int = new int[H][W];
		scn.nextLine();
		for (int i = 0; i < H; i++) {
			char[] ch = scn.nextLine().toCharArray();
			cake[i] = ch;
		}
		int num = 1;
		int h = -1;
		int count = 0;
		for (int i = 0; i < H; i++) {
			int s = 0;
			int w = -1;
			int nw = 0;
			for (int j = 0; j < W; j++) {
				if (cake[i][j] == '#')
					s++;
			}
			count+=s;
			if(s==0)continue;
			while (s != 0) {
				if (s == 1) {
					for (int k = h+1; k <= ((count==K)?H-1:i); k++) {
						for (int j = w+1; j < W; j++) {
							cake_int[k][j] = num;
						}
					}
					num++;
				} else {
					for(int j=w+1;j<W;j++) {
						if(cake[i][j]=='#') {
							nw = j;
							break;
						}
					}
					for (int k = h+1; k <= ((count==K)?H-1:i); k++) {
						for (int j = w+1; j <= nw; j++) {
							cake_int[k][j] = num;
						}
					}
					num++;
					w=nw;
				}
				s--;
			}
			h=i;
		}

		Printer.printMatrix(cake_int);
	}

}

class Printer{
	static void printArrayLine(int[] a) {
		int N = a.length;
		for(int i = 0;i < N;i++) {
			System.out.print(a[i] + ((i==N-1)?"\n":" "));
		}
	}

	static void printMatrix(int[][] a) {
		int N = a.length;
		int M = a[0].length;
		for(int i = 0;i < N;i++) {
			printArrayLine(a[i]);
		}
	}
}
