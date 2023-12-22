import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int[] a = strToIntArray(br.readLine());
			for (int i = 0; i < a[0]; i++) {
				String S = br.readLine();
				for (int j = 0; j < 2; j++)
					System.out.println(S);
			}

		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}

	static int[] strToIntArray(String S) {
		String[] strArray = S.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}
