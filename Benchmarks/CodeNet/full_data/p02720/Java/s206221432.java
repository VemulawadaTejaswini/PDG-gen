import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Long> lunlun = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			lunlun.add((long) i);
		}

		StringBuilder sb;

		int keta = 2;
		while(lunlun.size() < k) {
			for(int i = 1; i < 10; i++) {
				sb = new StringBuilder();
				sb.append(i);
				lun(keta, lunlun, i, sb);
			}
			keta++;
		}

		System.out.println(lunlun.get(k - 1));

		sc.close();
	}

	public static void lun(long n, List<Long> lunlun, int ini, StringBuilder sb) {
		if (n > 1) {
			if (ini == 0) {
				for (int i = 0; i < 2; i++) {
					lun(n - 1, lunlun, ini + i, sb.append(ini + i));
					sb.setLength(sb.length() - 1);
				}
			} else if (ini == 9) {
				for (int i = -1; i < 1; i++) {
					lun(n - 1, lunlun, ini + i, sb.append(ini + i));
					sb.setLength(sb.length() - 1);
				}
			} else {
				for (int i = -1; i < 2; i++) {
					lun(n - 1, lunlun, ini + i, sb.append(ini + i));
					sb.setLength(sb.length() - 1);
				}
			}
		} else {
			lunlun.add(Long.parseLong(sb.toString()));
		}
	}
}
