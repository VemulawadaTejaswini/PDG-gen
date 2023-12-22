
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int n;
		String[] vList;
		String[] vListFore;
		String[] vListBack;
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

			vListFore = Arrays.copyOfRange(vList, 0, vList.length / 2);
			int containsCountMinFore = vListFore.length;
			for (int i = 0; i < vListFore.length; i++) {
				int containsCount = 0;
				for (int j = 0; j < vListFore.length; j++) {
					if (vListFore[i].equals(vListFore[j]))
						containsCount++;
				}
				if (containsCount < containsCountMinFore)
					containsCountMinFore = containsCount;
				if (containsCount == vListFore.length)
					break;
			}

			vListBack = Arrays.copyOfRange(vList, vList.length / 2, vList.length);
			int containsCountMinBack = vListBack.length;
			for (int i = 0; i < vListBack.length; i++) {
				int containsCount = 0;
				for (int j = 0; j < vListBack.length; j++) {
					if (vListBack[i].equals(vListBack[j]))
						containsCount++;
				}
				if (containsCount < containsCountMinBack)
					containsCountMinBack = containsCount;
				if (containsCount == vListBack.length)
					break;
			}

			ans = (vListFore.length - containsCountMinFore) + (vListBack.length - containsCountMinBack);

			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

		}

	}

}
