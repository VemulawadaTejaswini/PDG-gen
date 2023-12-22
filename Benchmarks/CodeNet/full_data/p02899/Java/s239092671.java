import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] ans = new int[N];
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt()-1;
			ans[a] = i+1;
		}
		Printer.printArrayLine(ans);
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