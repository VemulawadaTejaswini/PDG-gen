
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class bc  implements Comparable<bc>{
	public long  b;
	public long c;

	public bc(String s) {
		String[] tmp = s.split(" ");
		this.b = Long.parseLong(tmp[0]);
		this.c = Long.parseLong(tmp[1]);
	}
	public int compareTo(bc other) {
		// cで降順ソート
		return this.c < other.c ? 1 : (this.c > other.c ? -1 : 0);
	}

	public String toString() {
		return "b=" + this.b + ", c="+this.c;
	}
}

public class Main {

	public static int search(long[] list, int start, long search) {
		int left = start;
		int right = list.length-1;
		while(right-left > 1) {
			int mid = (left+right)/2;
			if(list[mid]<=search) {
				left = mid;
			}
			if(list[mid]>search) {
				right = mid;
			}
		}
		return right;
	}

	public static void printA(long[] list) {
		for(long v: list) {
			System.out.print(v +", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);
		long[] a = new long[n];
		tmp = sc.nextLine().split(" ");
		for(int i=0; i<n; i++) {
			a[i] = Long.parseLong(tmp[i]);
		}
		ArrayList<bc> bc = new ArrayList<bc>();
		for(int i=0; i<m; i++) {
			bc.add(new bc(sc.nextLine()));
		}
		sc.close();

		Collections.sort(bc);

		Arrays.sort(a);
		printA(a);

		int start = 0;
		for(int i=0; i<m; i++) {
			bc target = bc.get(i);
			if (a[start] >= target.c) {
				break;
			}

			long p = search(a, start, target.c) - start;
			long num = p < target.b ? p : target.b;
			for(int j=0; j<num; j++) {
				a[start+j] = target.c;
			}
			start += num;
			printA(a);
		}

		long sum = 0;
		for(int i=0; i<n; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}