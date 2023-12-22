import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		List<Long> list = method(num);
		list.add(num);
		int size = list.size();
		if (size % 2 == 0) {
			int pos = size / 2;
			long a = list.get(pos);
			long b = list.get(pos - 1);
			System.out.println(a + b - 2);
		} else {
			int pos = size / 2;
			long a = list.get(pos);
			System.out.println(a + a - 2);
		}

	}

	public static List<Long> method(Long num) {
		List<Long> list = new ArrayList<>();
		Long sNum = Double.valueOf(Math.sqrt(num.doubleValue())).longValue();
		if (sNum % 2L != 0L) {
			sNum++;
		}
		for (Long i = 1L; i <= sNum; i++) {
			if (num % i == 0L) {
				list.add(i);
			}
		}
		Long temp = list.get(list.size() - 1);

		int size = list.size();
		if (num / temp == temp) {
			size = size - 1;
		}
		for (int i = size - 1; i > 0; i--) {
			Long n = list.get(i);
			list.add(num / n);
		}
		return list;
	}
}
