import java.util.Scanner;

public class Main{

	static long tate = 0;
	static long yoko = 0;

	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		int[] listx = new int [N];
		int[] listy = new int [N];

		int negtate = 0;
		int postate = 0;
		int negyoko = 0;
		int posyoko = 0;

		for (int index=0; index<N; index++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			listx [index] = x;
			listy [index] = y;

			if (x>0) {
				posyoko += x;
			} else {
				negyoko += x;
			}

			if (y>0) {
				postate += y;
			} else {
				negtate += y;
			}
		}
		boolean x = true;
		boolean y = true;

		if (posyoko<Math.abs(negyoko)) {
			x = false;
		}
		if (postate<Math.abs(negtate)) {
			y = false;
		}

		for (int index=0; index<N; index++) {
			if (x&&y) {
				first (listx,listy,index);
				// x=y=true;
			} else if (x&&!y) {
				//x=true, y=false;
				second (listx,listy,index);
			} else if (!x&&y) {
				//x=false; y=true;
				third (listx,listy,index);
			} else {
				// x=y=false;
				fourth (listx,listy,index);
			}
		}
		double num = Math.sqrt(Math.pow(yoko,2)+Math.pow(tate,2));

		System.out.println(num);
	}

	private static void fourth(int[] listx, int[] listy, int index) {
		// TODO 自動生成されたメソッド・スタブ
		if (listx[index]+listy[index]<0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}

	private static void third(int[] listx, int[] listy, int index) {
		// TODO 自動生成されたメソッド・スタブ
		if (listx[index]*-1+listy[index]>0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}

	private static void second(int[] listx, int[] listy, int index) {
		// TODO 自動生成されたメソッド・スタブ
		if (listx[index]+listy[index]*-1>0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}

	private static void first(int[] listx, int[] listy,int index) {

		if (listx[index]+listy[index]>0) {
			yoko += listx[index];
			tate += listy[index];
		}
	}
}