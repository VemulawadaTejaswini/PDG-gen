import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		StringBuilder [] list = new StringBuilder [N];

		for (int index=0; index<N; index++) {
			int time = sc.nextInt();
			int limit = sc.nextInt();

			StringBuilder sb;

			sb = new StringBuilder (Integer.toString(limit));

			for (int index2=sb.length(); index2<10; index2++) {
				sb.insert(0, "0");
			}

			sb.append(time);

			list[index]=sb;
		}

		Arrays.sort(list);

		long totalTime = 0;
		boolean flag = true;
		for (int index=0; index<N; index++) {
			StringBuilder sb = new StringBuilder (list[index]);
			int limit = Integer.parseInt(sb.substring(0, 10));
			int time = Integer.parseInt(sb.substring(10));
			totalTime+=time;
			if (totalTime>limit) {
				flag=false;
				break;
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}