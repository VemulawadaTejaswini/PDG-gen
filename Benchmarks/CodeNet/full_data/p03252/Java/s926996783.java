
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			int[] line = new int[3];
			for (int i = 0; i < 3; i++) {
				line[i] = scanner.nextInt();
			}

			Arrays.sort(line);

			int result = line[2] * 10 + line[1] + line[0];

			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numM = 0;
		int numX = 0;
		int numY = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			numX = scanner.nextInt();
			numY = scanner.nextInt();

			int[] targetX = new int[numN];
			for (int i = 0; i < numN; i++) {
				targetX[i] = scanner.nextInt();
			}

			Arrays.sort(targetX);

			int[] targetY = new int[numM];
			for (int i = 0; i < numM; i++) {
				targetY[i] = scanner.nextInt();
			}

			Arrays.sort(targetY);

			int numZ = targetX[numN - 1] + 1;

			if (numX < numZ && numZ <= numY && targetY[0] >= numZ) {
				System.out.println("No War");
			} else {
				System.out.println("War");
			}

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		String lineS = "";
		String lineT = "";

		try {
			scanner = new Scanner(System.in);
			lineS = scanner.nextLine();
			lineT = scanner.nextLine();

			char[] wkS = lineS.toCharArray();
			char[] wkT = lineT.toCharArray();

			if (wkS.length != wkT.length) {
				System.out.println("No");
				return;
			}

			Map<Character, Character> mapS = new HashMap<Character, Character>();
			for (int i = 0; i < wkS.length; i++) {
				char wS = wkS[i];
				char wT = wkT[i];
				if (mapS.get(wS) == null) {
					mapS.put(wS, wT);
				} else if (!mapS.get(wS).equals(wT)) {
					System.out.println("No");
					return;
				}
			}

			Map<Character, Character> mapT = new HashMap<Character, Character>();
			for (int i = 0; i < wkS.length; i++) {
				char wS = wkS[i];
				char wT = wkT[i];
				if (mapT.get(wT) == null) {
					mapT.put(wT, wS);
				} else if (!mapT.get(wT).equals(wS)) {
					System.out.println("No");
					return;
				}
			}

			Map<Character, Character> wkMap = new HashMap<Character, Character>();

			for (Iterator<Entry<Character, Character>> iterator = mapS.entrySet().iterator(); iterator.hasNext();) {

				Entry<Character, Character> key = iterator.next();
				if (wkMap.get(key.getValue()) == null) {
					wkMap.put(key.getValue(), key.getKey());
				} else {
					Character wkChara = wkMap.get(key.getValue());
					if (!wkChara.equals(key.getKey())) {
						System.out.println("No");
						return;
					}
				}
			}

			System.out.println("Yes");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}