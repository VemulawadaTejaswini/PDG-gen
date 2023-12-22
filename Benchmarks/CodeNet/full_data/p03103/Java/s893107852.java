import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		TreeMap<Long, Long> tmap = new TreeMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			tmap.put(sc.nextLong(), sc.nextLong());
		}

		long sum = 0;
		for (Long cost : tmap.keySet())
        {
			long num = tmap.get(cost);
            if (M - num >= 0) {
				sum += cost * num;
				M -= num;
			} else {
				sum += cost * M;
				break;
			}
        }

		System.out.println(sum);
	}

}