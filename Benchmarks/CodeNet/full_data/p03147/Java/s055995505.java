
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = sc.nextInt();
		int tmp2 = tmp;
		List<Integer> list = new ArrayList<>();
		if(N == 1) {
			list.add(tmp);
		}
		boolean up = false, down = false;
		for(int i = 1; i < N; i++) {
			tmp2 = sc.nextInt();
			if(tmp2 > tmp) {
				if(!up) {
					list.add(tmp);
				}
				up = true;
				down = false;
			} else if(tmp2 < tmp) {
				if(!down) {
					list.add(tmp);
				}
				down = true;
				up = false;
			}
			if(i == N - 1) {
				list.add(tmp2);
			}
			tmp = tmp2;
		}
		int ans = list.get(0);
		int high = list.get(0);
		list.remove(0);
		while(!list.isEmpty()) {
			if(high < list.get(0)) {
				ans += list.get(0) - high;
			}
			high = list.get(0);
			list.remove(0);
		}
		System.out.println(ans);
	}

}
