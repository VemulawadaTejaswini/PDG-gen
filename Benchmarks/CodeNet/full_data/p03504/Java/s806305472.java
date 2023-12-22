import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		PriorityQueue<Record> queue = new PriorityQueue<>();
		int last = 0;
		for (int i = 0; i < n; i++) {
		    Record r = new Record(sc.nextInt() - 1, sc.nextInt(), sc.nextInt());
		    last = Math.max(last, r.end);
		    queue.add(r);
		}
		int[] imos = new int[last + 1];
		Record prev = queue.poll();
		while (queue.size() > 0) {
		    Record x = queue.poll();
		    if (prev.channel == x.channel && prev.end >= x.start) {
		        prev.end = x.end;
		    } else {
		        imos[prev.start]++;
		        imos[prev.end]--;
		        prev = x;
		    }
		}
        imos[prev.start]++;
        imos[prev.end]--;
        int max = imos[0];
        for (int i = 1; i < last; i++) {
            imos[i] += imos[i - 1];
            max = Math.max(max, imos[i]);
        }
       System.out.println(max);
   }
   
   static class Record implements Comparable<Record> {
       int start;
       int end;
       int channel;
       
       public Record(int start, int end, int channel) {
           this.start = start;
           this.end = end;
           this.channel = channel;
       }
       
       public int compareTo(Record another) {
           if (channel == another.channel) {
               return start - another.start;
           } else {
               return channel - another.channel;
           }
       }
   }
}


