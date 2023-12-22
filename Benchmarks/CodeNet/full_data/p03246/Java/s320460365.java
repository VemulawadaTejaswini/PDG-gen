
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int n;
		String[] vList;
		int ans = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(reader.readLine());
			vList = reader.readLine().split(" ");
			if (n != vList.length)
				return;
			Arrays.sort(vList);

			Arrays.asList(vList).forEach(str -> Integer.parseInt(str));

			if (vList[0].equals(vList[vList.length - 1])) {
				System.out.println(vList.length / 2);
				return;
			}

			int containsCountMin = 0;
			int containsCountMax = 0;
			for (int i = 0; i < vList.length; i++) {
				if (vList[0].equals(vList[i]))
					containsCountMin++;
				if (vList[vList.length - 1].equals(vList[i]))
					containsCountMax++;
			}

			if (containsCountMin > vList.length / 2)
				containsCountMin = vList.length / 2;

			if (containsCountMax > vList.length / 2)
				containsCountMax = vList.length / 2;

			ans = Math.abs(containsCountMin - vList.length / 2) + Math.abs(containsCountMax - vList.length / 2);
			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

		}

	}

}
