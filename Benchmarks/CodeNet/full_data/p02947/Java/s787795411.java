import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String[] array = new String[N];
		for (int i = 0; i < N; i++) {
			String s = scan.nextLine();
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			array[i] = String.valueOf(chars);
		}
		Arrays.sort(array);
		String before = array[0];
		long cnt = 0;
		long addCnt = 0;
		for (int i = 1; i < N; i++) {
			if (before.equals(array[i])) {
				cnt += addCnt;
				addCnt++;
				cnt++;
			}
			else {
				addCnt = 0;
			}
			before = array[i];
		}

		System.out.println(cnt);
	}
}
