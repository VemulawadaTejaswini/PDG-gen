
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		Map<String, Integer> map = new HashMap<String, Integer>();

		int ans = 0;

		for(int i = 0; i < n; i ++) {

			String temp = scanner.nextLine();

			temp = sortString(temp);

			if(map.containsKey(temp)) {

				ans++;

			}else {

				map.put(temp, 1);

			}

		}

		System.out.println(ans);



	}

	public static String sortString(String text) {

		char[] chars = text.toCharArray();
		Arrays.sort(chars);

		return new String(chars);

	}

}
