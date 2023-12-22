import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		if (len == 1) {
			System.out.println(sc.nextLine());
		}else {
			int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(line);
			long min = 1000000000000000000L;
			long ans = 0;
			if (line[0] == line[len-1]) {
				System.out.println(0);
			}else {
				for (int i = line[0]; i < line[len - 1]; i++) {
					ans = 0;
					for (int j = 0; j < len; j++) {
						ans += (line[j] - i)*(line[j] - i);
					}
					if (ans < min) {
						min = ans;
					}
				}
				System.out.println(min);
			}
		}

	}
}
