import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] temp = scanner.nextLine().split(" ");
		Map<Long, Long> map = new HashMap<Long,Long>();

		for(int i = 0; i < n; i++) {

			Long tmp = Long.parseLong(temp[i]);

			if(!map.containsKey(tmp)) {

				map.put(tmp, (long) 1);

			}else {

				System.out.println("NO");
				return;

			}

		}

		System.out.println("YES");

	}
}