import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();
		long num = 0;
		long cnt = 0;
		long temp = 0;
		int index = 0;
		long mod = 0;

		List<Long> que = new ArrayList<>();

		while(num <= 8) {
			num++;
			que.add(num);
			cnt++;
			if(cnt == k) {
				System.out.println(num);
				return;
			}
		}

		while(true) {
			temp = que.get(index);
			mod = temp%10;

			if(mod-1>=0) {
				num = temp*10 + (mod-1);
				que.add(num);
				cnt++;
				if(cnt == k) {
					System.out.println(num);
					return;
				}
			}

			num = temp*10 + (mod);
			que.add(num);
			cnt++;
			if(cnt == k) {
				System.out.println(num);
				return;
			}

			if(mod+1 < 10) {
				num = temp*10 + (mod+1);
				que.add(num);
				cnt++;
				if(cnt == k) {
					System.out.println(num);
					return;
				}
			}

			index++;
		}
	}
}
