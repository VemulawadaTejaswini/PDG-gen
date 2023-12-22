import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Queue<Integer> queue = new PriorityQueue<>();        
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            queue.add(A);
        }
        
        int[][] BC = new int[M][2];
        for(int i = 0; i < M; i++){
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            BC[i][0] = B;
            BC[i][1] = C;
        }
        
        Arrays.sort( BC, (BC1, BC2) -> BC2[1] - BC1[1] );
        
        for(int i = 0; i < M; i++){
            while( queue.peek() < BC[i][1] && BC[i][0] > 0 ){
                queue.add(BC[i][1]);
                queue.poll();
                BC[i][0]--;
            }
        }
        
        long total = 0;
        for(int i : queue){
            total += i;
        }
        
        System.out.println(total);

    }
}
