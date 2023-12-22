import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] coor = in.readLine().toCharArray();
		int cN = 0, cS = 0, cW = 0, cE = 0;
		for (int i = 0; i < coor.length; i++) {
			if (coor[i] == 'N') {
				cN++;
			} else if (coor[i] == 'W') {
				cW++;
			} else if (coor[i] == 'S') {
				cS++;
			} else if (coor[i] == 'E') {
				cE++;
			}
		}
		if (cN >= 1 && cE >= 1 || cN >= 1 && cW >= 1 || cS >= 1 && cE >= 1 || cS >= 1 && cW >= 1) {
			if (cN >= 1 && cW >= 1 && cS >= 1 && cE >= 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		} else if ((cN >= 1 && cE == 0 && cN >= 1 && cW == 0) || (cS >= 1 && cE == 0 && cS >= 1 && cW == 0)) {
			if (cN >= 1 && cS >= 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		} else if ((cN == 0 && cE >= 1 && cE >= 1 && cS == 0) || (cW >= 1 && cN == 0 && cW >= 1 && cS == 0)) {
			if (cE >= 1 && cW >= 1)
				System.out.println("Yes");
			System.out.println("No");
		} else
			System.out.println("No");

	}

}
