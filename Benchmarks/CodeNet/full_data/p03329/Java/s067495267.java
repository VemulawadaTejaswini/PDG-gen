import java.util.Scanner;

public class Main {
	static int N;
	static int wkN;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		wkN = N;
		int count = 0;
		while (wkN >= 6) {
			int night[] = make(wkN, 9);
			int six[] = make(wkN, 6);
			if (night[0] > six[0]) {
				wkN = night[0];
				count++;
			} else {
				wkN = six[0];
				count++;
			}
			
			
		}
	}
	static int[] make(int x, int num) {
		int i = 1;
		int count = 0;
		int ans[] = new int[2];
		while (i >= x) {
			i *= num;
			count++;
		}
		ans[0] = (i/num);
		ans[1] = --count;
		return ans;
	}
}