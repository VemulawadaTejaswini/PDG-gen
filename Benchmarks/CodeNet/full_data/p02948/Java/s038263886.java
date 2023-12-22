import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		Work[] W = new Work[N];
		for (int i = 0; i < N; i++) {
			W[i] = new Work(scn.nextInt(), scn.nextInt());
		}
		Arrays.sort(W);

		ArrayList<Integer> pos = new ArrayList<Integer>();
		for(int i = 1;i <=M;i++) {
			pos.add(i);
		}

		int num[] = new int[M+1];
		long ans = 0;
		for(Work w:W) {
			if(pos.size() ==0)break;
			int d = w.day;
			int j = check(d,pos);
			if(j!=-1) {
				num[pos.get(j)] = w.value;
				pos.remove(j);
			}
		}
		for(long a:num) {
			ans +=a;
		}
		System.out.println(ans);

	}

	static int check(int d, ArrayList<Integer> pos) {
		int l = 0;
		int r = pos.size()-1;
		if(pos.get(r) < d)return -1;
		if(pos.get(l) >= d) return 0;
		int mid;
		while(r-l > 1) {
			mid = (l+r)/2;
			if(pos.get(mid) < d) {l = mid;
			}else {
				r = mid;
			}
		}


		return r;
	}
}

class Work implements Comparable<Work> {
	int day;
	int value;

	public Work(int day, int value) {
		this.day = day;
		this.value = value;
	}

	@Override
	public int compareTo(Work o) {
		if (this.value > o.value) {
			return -1;
		}
		if (this.value < o.value) {
			return 1;
		}

		if (this.day < o.day) {
			return -1;
		}
		if (this.day > o.day) {
			return 1;
		}
		return 0;
	}

	public String toString() {
		return this.day + ":" + this.value;
	}
}
