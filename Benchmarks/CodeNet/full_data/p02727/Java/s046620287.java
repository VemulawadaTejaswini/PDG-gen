import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Long p[] = new Long[a];
		Long q[] = new Long[b];
		Long r[] = new Long[c];
		for(int i=0; i<a; i++) p[i]=sc.nextLong();
		for(int i=0; i<b; i++) q[i]=sc.nextLong();
		for(int i=0; i<c; i++) r[i]=sc.nextLong();
		Arrays.sort(p, Collections.reverseOrder());
		Arrays.sort(q, Collections.reverseOrder());
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i=0; i<x; i++) list.add(p[i]);
		for(int i=0; i<y; i++) list.add(q[i]);
		for(int i=0; i<c; i++) list.add(r[i]);
		Collections.sort(list, Collections.reverseOrder());
		long sum = 0;
		for(int i=0; i<x+y; i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		sc.close();
	}
}
