import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        Queue<Integer> queue = new PriorityQueue<>( (s1, s2) -> (s2 - 1) % 10 - (s1 - 1) % 10 );
        
        for(int i = 0; i < 5; i++){
            queue.add(sc.nextInt());
        }

        int totalTime = 0;
        for(int i = 0; i < 5; i++){
            int x = queue.poll();
            if( i != 4 ) x = (((x - 1) / 10) + 1) * 10;
            totalTime += x;
        }
        
        System.out.println(totalTime);
    }
}
