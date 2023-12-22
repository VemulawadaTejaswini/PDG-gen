import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		PriorityQueue<Def> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			pq.add(new Def(sc.nextInt(), sc.nextInt()));
		}

		long ans = 0;
		while(true) {
			Def d = pq.poll();
			if(d.num >= m) {
				ans += d.price * m;
				break;
			}else {
				ans += d.price * d.num;
				m -= d.num;
			}
		}

		System.out.println(ans);
	}
}

class Def implements Comparable<Def> {
	int price;
	int num;

	Def(int price, int num) {
		this.price = price;
		this.num = num;
	}

	@Override
	public int compareTo(Def d) {
		return price - d.price;
	}
}
