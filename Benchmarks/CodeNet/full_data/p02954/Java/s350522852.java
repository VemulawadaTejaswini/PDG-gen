
import java.util.Scanner;

public class Main {

	static String arrS;
	static int n = 0;
	static int[] numS;
	static String[] array;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		arrS = s.next();
		n = arrS.length();
		numS = new int[n];
		array = arrS.split("");
		s.close();
		for (int i = 0; i < n; i++) {
			int lorr = -1;
			int move = 2;
			if (array[i] == "L") {
				lorr = 0;
				move = (-1);
			} else {
				lorr = 1;
				move = 1;
			}
			int idoCount = conSt(i, lorr);
			if (idoCount % 2 == 0) {
				numS[i - move * idoCount]++;
			} else {
				numS[i - move * (idoCount + 1)]++;
			}
		}
		for (int d : numS) {
			System.out.println(d);
		}

		System.out.println();
	}

	public static int conSt(int i, int lorR) {
		int move = 2;
		if (lorR == 0) {
			move = (-1);
		} else {
			move = 1;
		}
		int count = 0;
		while (true) {
			if (array[i + move] == array[i]) {
				count++;
			} else {
				break;
			}
		}
		return count;

	}

}
