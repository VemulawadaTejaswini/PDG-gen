import java.util.Scanner;

public class Main {

	int fx;

	long[] as;
	int aNum;
	int aAbsMinIndex;
	long b;

	public Main(int m) {
		this.fx = 0;
		this.as = new long[m];
		this.aNum = 0;
		this.aAbsMinIndex = 0;
		this.b = 0;
	}

	public void print()
	{
		long sum = this.b;
		for(int i =0 ;i<this.aNum; i++) {
			sum += Math.abs(this.as[i] - this.as[this.aAbsMinIndex]);
		}
		System.out.println(this.as[this.aAbsMinIndex] + " " + sum);
	}

	public void update(long a, long b) {
		this.as[aNum] = a;
		if (this.as[this.aAbsMinIndex] > Math.abs(a)
				|| this.as[this.aAbsMinIndex] == Math.abs(a) && a < this.as[this.aAbsMinIndex]) {
			this.aAbsMinIndex = this.aNum;
		}
		this.aNum++;
		this.b += b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.nextLine());
		Main main = new Main(q);
		for(int i = 0; i<q; i++) {
			String[] tmp = sc.nextLine().split(" ");
			if (tmp[0].equals("2")) {
				main.print();
			} else {
				main.update(Long.parseLong(tmp[1]), Long.parseLong(tmp[2]));
			}
		}
		sc.close();

	}
}
