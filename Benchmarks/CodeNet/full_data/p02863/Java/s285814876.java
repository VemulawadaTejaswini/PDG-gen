
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		List<Pair> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			list.add(new Pair(a[i] / (double) b[i], i));
		}
		List<Integer> used = new ArrayList<>();
		list.sort(Comparator.comparing(Pair::getPef).reversed());
		int tpre = 0;
		long ans = 0;
		int lastnum = 0;
		while(tpre < t) {
			int num = list.get(0).getNum();
			tpre += b[num];
			ans += a[num];
			lastnum = num;
			used.add(num);
		}
		ans -= a[lastnum];
		int max = 0;
		for(int i = 0; i < n; i++) {
			if(!(used.contains(i) || lastnum == i)) {
				max = Math.max(max, a[i]);
			}
		}
		ans += max;
		System.out.println(ans);
	}

}

class Pair {
	double pef;
	int num;

	public double getPef() {
		return pef;
	}

	public void setPef(double pef) {
		this.pef = pef;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	protected Pair(double pef, int num) {
		super();
		this.pef = pef;
		this.num = num;
	}

}