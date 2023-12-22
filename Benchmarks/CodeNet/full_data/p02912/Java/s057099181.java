import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            sum += A[i];
            pq.add(A[i]);
        }
        sc.close();

        for(int i = 0; i < M; i++){
            int a = pq.poll();
            sum -= a;
            sum += a/2;
            pq.add(a/2);
        }

        System.out.println(sum);
    }
}