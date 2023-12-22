import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        PriorityQueue<Bridge> queue = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            queue.add(new Bridge(sc.nextInt(), sc.nextInt()));
        }
        int count = 0;
        while (queue.size() > 0) {
            count++;
            Bridge bridge = queue.poll();
            while (queue.size() > 0 && queue.peek().start < bridge.end) {
                queue.poll();
            }
        }
        System.out.println(count);
	}
	
	static class Bridge implements Comparable<Bridge> {
	    int start;
	    int end;
	    
	    public Bridge(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }
	    
	    public int compareTo(Bridge another) {
	        return end - another.end;
	    }
	}
}
