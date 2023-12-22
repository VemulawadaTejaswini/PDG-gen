
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();// 修行回数
		int A[] = new int[N];// 消化コスト
		int F[] = new int[N];// 食べにくさ
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			F[i] = sc.nextInt();
		}

		// 消化コストが高い人と、食べにくさが低い食べ物をマッチングする。
		Arrays.sort(A);
		Arrays.sort(F);

		PriorityQueue pq = new PriorityQueue(1, new MyComparator());

		long ans = 0;
		long tmp = 0;
		for (int i = 0; i < N; i++) {
			Food food = new Food();
			food.setTime(A[i] * F[(F.length - 1) - i]);
			food.setCost(A[i]);
			food.setBad(F[(F.length - 1) - i]);
			pq.add(food);// 大きい順に取り出せる
		}
		
		while (K >0) {
			Food fd1 = (Food) pq.poll();// 一番時間かかる
			Food fd2 = (Food) pq.peek();
			long dif = fd1.getCost() - fd2.getCost();
			long Kmi = (dif + (fd1.getBad()) - 1) / fd1.getBad();// 切り上げ
			K -= (Kmi+1);
			fd1.setCost(fd1.getCost() - Kmi * fd1.getBad());
			fd1.setTime(fd1.getBad() * fd1.getCost());
			pq.add(fd1);
		}
		ans = Math.max(((Food)pq.poll()).getTime(),0);
		System.out.println(ans);
	}

}

class Food {
	private long time;
	private long cost;
	private long bad;

	public long getBad() {
		return bad;
	}

	public void setBad(long bad) {
		this.bad = bad;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Food a1 = (Food) o1;
		Food a2 = (Food) o2;

		if (a1.getCost() < a2.getCost()) {
			return 1;
		} else if (a1.getCost() > a2.getCost()) {
			return -1;
		} else {
			return 0;
		}
	}

}