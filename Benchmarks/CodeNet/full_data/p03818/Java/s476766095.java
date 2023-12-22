import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	int num = sc.nextInt();
        	freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int freq : freqMap.values()) {
        	pq.offer(freq);
        }

        while(pq.size() > 1) {
            if(pq.peek() == 1) {
        		break;
        	}
        	int cnt1 = pq.poll();
        	int cnt2 = pq.poll();
        	if(cnt1 - 1 > 0)
    			pq.offer(cnt1-1);
    		if(cnt2 - 1 > 0) {
    			pq.offer(cnt2-1);
    		}
        }
        if(pq.peek() > 1)
            System.out.println(1);
        else
            System.out.println(pq.size());
    }
}
