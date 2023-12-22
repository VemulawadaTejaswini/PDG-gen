import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] ary = new int[N * 3];
        
        for(int i = 0; i < N * 3; i++){
            ary[i] = in.nextInt();
        }
        
        long ans = -1000000000000000000l;
        for(int k = N; k <= 2 * N; k++){
            //front
            PriorityQueue f_queue = new PriorityQueue();
            long f_sum = 0;
            for(int i = 0; i < k; i++){
                f_queue.add(ary[i]);
                f_sum += ary[i];
            }
            for(int i = 0; i < k - N; i++){
                f_sum -= (int)f_queue.poll();
            }
            
            //rear
            PriorityQueue r_queue = new PriorityQueue();
            long r_sum = 0;
            for(int i = k; i < N * 3; i++){
                r_queue.add(-ary[i]);
                r_sum += -ary[i];
            }
            for(int i = 0; i < 2 * N - k; i++){
                r_sum -= (int)r_queue.poll();
            }
            if(f_sum + r_sum > ans) ans = f_sum + r_sum;
        }
        System.out.println(ans);
    }
}
