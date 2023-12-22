import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        Integer M = scan.nextInt();
        long totalEarn = 0;
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for(int i = 0; i < N; i++){
            Integer A = scan.nextInt();
            Integer B = scan.nextInt();
            if(A > M)
                continue;

            if(map.containsKey(A)){
                List<Integer> list = map.get(A);
                list.add(B);
                Collections.sort(list, Comparator.reverseOrder());
            } else {    
                List<Integer> list = new ArrayList<Integer>();
                list.add(B);
                map.put(A, list);
            }
        }
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    if(map.size() > 0) {
            for(int i = 1; i < M + 1; i++) {
                if(map.containsKey(i)) {
                    if(map.get(i).isEmpty())
                        continue;
                    
                  	for(Integer earn : map.get(i)) {
                        pq.add(earn);
                  	}
                }   
                // System.out.println(candidate);
                if(!pq.isEmpty()) {
                    totalEarn += pq.poll();
                }
            }
        }
        System.out.println(totalEarn);
        
    }
}
