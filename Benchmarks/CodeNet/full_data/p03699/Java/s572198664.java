import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int answer = 0;
        
        int N = scan.nextInt();
        PriorityQueue pq = new PriorityQueue();
        int s;
        
        for(int i = 0; i < N; i++) {
            s = scan.nextInt();
            answer += s;
            pq.add(s);
        }
        
        while(!pq.isEmpty()) {
            if(answer % 10 != 0) {
                break;
            } else {
                s = (int)pq.poll();
                answer -= s;
            }
        }
        System.out.println(answer);
    }
}
