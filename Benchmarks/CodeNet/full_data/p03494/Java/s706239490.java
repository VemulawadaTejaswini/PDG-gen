import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			int count = 0;
			int tmp = list.get(i);
			while(tmp % 2 == 0) {
				tmp = tmp / 2;
				count++;
			}
			if(answer >= count) {
				answer = count;
			}
		}
		System.out.println(answer);
	}
}