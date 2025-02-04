import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cardNum = scan.nextInt();
		long cardSum = 0;

		ArrayList<Long> list = new ArrayList<Long>();

		for(int i = 0; i < cardNum; i++) {
			long num = scan.nextLong();
			list.add(num);
			cardSum += num;
		}

		long sunukeSum = 0;
		long kumaSum = cardSum;
		long answer = 10000000000L;

		for(int i = 0; i < cardNum - 1; i++) {
			sunukeSum += list.get(i);
			kumaSum -= list.get(i);
			if(Math.abs(sunukeSum - kumaSum) < answer) {
				answer = Math.abs(sunukeSum - kumaSum);
			}
		}

		System.out.println(answer);
	}
}