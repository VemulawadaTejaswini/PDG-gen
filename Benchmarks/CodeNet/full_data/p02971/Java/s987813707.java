import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int n  = sc.nextInt();
            A[i]=n;
            pq.offer(n);
        }
        int max = pq.remove();
        int max2 = pq.remove();
        for (int i = 0; i < N; i++) {
            int n = A[i];
            if(n==max){
                System.out.println(max2);
            }else{
                System.out.println(max);
            }

        }


    }

}
