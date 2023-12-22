import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Main main = new Main();
		Store store[] = new Store[N];
		for (int i=0;i<N;i++) {
			Store temp = main.new Store();
			temp.A = sc.nextLong();
			temp.B = sc.nextInt();
			store[i] = temp;
		}
		Arrays.sort(store);
		long sum =0;
		int count=0;
		for (int i=0;i<N;i++) {
			if (count +store[i].B>=M) {
				sum += (M-count)*store[i].A;
				break;
			} else {
				sum +=store[i].B*store[i].A;
				count +=store[i].B;
			}
		}
		System.out.println(sum);
	}

	public class Store implements Comparable<Store> {
		long A;
		int B;
		@Override
		public int compareTo(Store o) {
			if (this.A>o.A)
				return 1;
			if (this.A==o.A)
				return 0;
			return -1;
		}

	}
}