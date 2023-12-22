import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 考えうる方策
		// リストに格納して平均値をとり、そこからの差を求める？

		ArrayList<Integer> coor = new ArrayList<Integer>();

		while(sc.hasNext()) {
			coor.add(sc.nextInt());
		}

		Collections.sort(coor);

		int sum = 0;
		int answer = coor.get(N) * coor.get(N);

		for(int i = 1; i <= 100; i++) {

			for(Integer j: coor) {
					sum += (j - i)*(j - i);
			}
			if(sum <= answer) {
				answer = sum;
			}
		}

		System.out.println(answer);
	}
}
