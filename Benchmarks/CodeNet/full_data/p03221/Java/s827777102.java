import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < m; i++) {
            int pNum = sc.nextInt();
            int yNum = sc.nextInt();
            p[i] = pNum;
            y[i] = yNum;
            if(map.containsKey(pNum)) {
                map.get(pNum).add(yNum);
            } else {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.add(yNum);
                map.put(pNum, pq);
            }
        }
        HashMap<Integer, HashMap<Integer, Integer>> data = new HashMap<>();
        for(Map.Entry<Integer, PriorityQueue<Integer>> entry: map.entrySet()) {
            int prefecture = entry.getKey();
            int counter = 1;
            HashMap<Integer, Integer> order = new HashMap<>();
            PriorityQueue<Integer> queue = entry.getValue();
            while(!queue.isEmpty()) {
                order.put(queue.poll(), counter);
                counter++;
            }
            data.put(prefecture, order);
        }
        for(int i = 0; i < m; i++) {
            System.out.print(String.format("%06d", p[i]));
            System.out.println(String.format("%06d", data.get(p[i]).get(y[i])));
        }
    }
}
