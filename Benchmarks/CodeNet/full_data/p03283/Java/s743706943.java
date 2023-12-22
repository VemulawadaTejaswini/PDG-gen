
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		List<Pair> train = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			train.add(new Pair(l, r));
		}
		for(int i = 0; i < q; i++) {
			int count = 0;
			int l = sc.nextInt();
			int r = sc.nextInt();
			for(Pair e : train) {
				if(l <= e.getFr() && e.getBa() <= r) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}

class Pair {
	private int fr;
	private int ba;

	protected Pair(int fr, int ba) {
		super();
		this.fr = fr;
		this.ba = ba;
	}

	public int getFr() {
		return fr;
	}

	public void setFr(int fr) {
		this.fr = fr;
	}

	public int getBa() {
		return ba;
	}

	public void setBa(int ba) {
		this.ba = ba;
	}

}
