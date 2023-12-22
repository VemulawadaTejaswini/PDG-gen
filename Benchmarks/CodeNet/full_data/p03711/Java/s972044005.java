import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int[] largeArray = { 1, 3, 5, 7, 8, 10, 12 };
		int[] smallArray = { 4, 6, 9, 11 };
		String str = "Yes";
		if (x == 2 || y == 2 || isNotIncludingSameArrays(x, y, smallArray)) {
			str = "No";
		}
		if(isNotIncludingSameArrays(x, y, largeArray)){
			str = "No";
		}
		if(isNotIncludingSameArrays(x, y, smallArray)){
			str = "No";
		}
		System.out.println(str);
	}

	static boolean isNotIncludingSameArrays(int x, int y, int[] numArrays) {

		boolean xflag = false, yflag = false;
		for (int i = 0; i < numArrays.length; i++) {
			if (x == numArrays[i]) {
				xflag = true;
			}
			if (y == numArrays[i]) {
				yflag = true;
			}
		}
		return xflag ^ yflag;
	}

}
