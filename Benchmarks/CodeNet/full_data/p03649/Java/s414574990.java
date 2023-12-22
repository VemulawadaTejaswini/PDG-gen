import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ", n);
		PriorityQueue<Long> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(- Long.parseLong(line[i]));
		}
		long total = 0;
		while(true) {
		    long target = - queue.poll();
		    if (target + total < n) {
		        break;
		    }
		    long count = (target + total) / n;
		    total += count;
		    target -= count * (n + 1);
		    queue.add(- target);
		}
		System.out.println(total);
    }
}

