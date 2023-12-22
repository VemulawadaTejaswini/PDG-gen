import java.util.*;

public class Main {
    static final int SIZE = 40;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		long[] xArr = new long[x];
		long[] yArr = new long[y];
		long[] zArr = new long[z];
		for (int i = 0 ; i < x; i++) {
		    xArr[i] = sc.nextLong();
		}
		for (int i = 0 ; i < y; i++) {
		    yArr[i] = sc.nextLong();
		}
		for (int i = 0 ; i < z; i++) {
		    zArr[i] = sc.nextLong();
		}
		PriorityQueue<Long> xy = new PriorityQueue<>();
		for (int i = 0; i < x; i++) {
		    for (int j = 0; j < y; j++) {
		        xy.add(- xArr[i] - yArr[j]);
		    }
		}
		PriorityQueue<Long> xyz = new PriorityQueue<>();
		for (int i = 0; i < k && xy.size() > 0; i++) {
		    long tmp = xy.poll();
		    for (int j = 0; j < z; j++) {
		        xyz.add(tmp - zArr[j]);
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
		    sb.append(- xyz.poll()).append("\n");
		}
		System.out.print(sb);
    }
}

