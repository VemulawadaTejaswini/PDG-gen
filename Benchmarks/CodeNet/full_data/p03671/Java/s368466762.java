import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue();
        for(int i = 0; i < 3; i++) {
            pq.add(scan.nextInt());
        }
        int answer = 0;
        answer+=((int)pq.poll());
        answer+=((int)pq.poll());
        System.out.println(answer);
    }
}
