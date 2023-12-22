import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Queue<Integer> queue = new PriorityQueue<>( (s1, s2) -> s2 - s1 );
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            queue.add(A);
        }
        
        for(int i = 0; i < M; i++){
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            for(int j = 0; j < B; j++){
                queue.add(C);
            }
        }
        
        long total = 0;
        for(int i = 0; i < N; i++){
            total += queue.poll();
        }
        
        System.out.println(total);

    }
}
