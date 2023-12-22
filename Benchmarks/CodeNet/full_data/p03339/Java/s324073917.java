import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		ArrayList<Integer> sumWE = new ArrayList<Integer>();
		int a = Integer.parseInt(line);
		int sum = a;
		int countE = 0;
		int countW = 0;
		String[] param = br.readLine().split("");
		for (int j = 0; j < a; j++) {
			for (int k = 0; k < a; k++) {
				if (k > j && param[k].equals("E")) {
					countE++;
				}else if (k < j && param[k].equals("W")) {
					countW++;
				}
			}
			sumWE.add(countE + countW);
			countE = 0;
			countW = 0;
		}
		Collections.sort(sumWE);
		System.out.println(sumWE.get(0));
	}
}