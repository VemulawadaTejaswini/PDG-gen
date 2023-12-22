
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine());
		long[] numline = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		int ans = 0;
		for (int i = 0; i < line; i++) {
			while (true) {
				if (numline[i] % 2L == 0) {
					numline[i] = numline[i] / 2L;
					ans++;
				} else {
					break;
				}
			}
		}
		sc.close();
		System.out.println(ans);
	}


}