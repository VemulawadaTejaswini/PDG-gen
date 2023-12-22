import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			int num = Integer.parseInt((br.readLine()));
			String[] stringArr = br.readLine().split(" ");
			Integer[] intArr = new Integer[num];
			int answer = 0;

			for (int i = 0; i < intArr.length; i++) {
				intArr[i] = Integer.valueOf(stringArr[i]);
			}

			Arrays.sort(intArr, Collections.reverseOrder());

			for (int i = 0; i < intArr.length; i++) {
				if (i % 2 == 0) {
					answer += intArr[i];
				} else {
					answer -= intArr[i];
				}
			}

			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}