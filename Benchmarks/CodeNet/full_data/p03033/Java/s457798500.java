import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        PriorityQueue<Event> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Event(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < q; i++) {
            map.put(sc.nextInt(), i);
        }
        int[] ans = new int[q];
        Arrays.fill(ans, -1);
        while (queue.size() > 0) {
            Event e = queue.poll();
            Map.Entry<Integer, Integer> x = map.ceilingEntry(e.start - e.point);
            while (x != null && x.getKey() < e.end - e.point) {
                ans[x.getValue()] = e.point;
                map.remove(x.getKey());
                x = map.ceilingEntry(e.start - e.point);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int x : ans) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
    
    static class Event implements Comparable<Event> {
        int start;
        int end;
        int point;
        
        public Event(int start, int end, int point) {
            this.start = start;
            this.end = end;
            this.point = point;
        }
        
        public int compareTo(Event another) {
            return point - another.point;
        }
    }
}