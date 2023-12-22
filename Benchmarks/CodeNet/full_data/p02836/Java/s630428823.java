import java.util.*;
import java.io.*;

class main {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		str = str.toLowerCase();

		int count = 0;
		int sl = str.length();
		int i = 0, j = sl - 1;

		if ((sl < 1) || (sl > 100)) {
			throw new Exception("Invalid Input String Length");
		} else {
			while (i <= j) {

				if ((str.charAt(i)) != (str.charAt(j))) {
					count++;
				}
				i++;
				j--;
			}
			System.out.println(count);
		}
	}
}