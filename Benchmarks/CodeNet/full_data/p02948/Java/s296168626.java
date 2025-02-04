import java.util.Scanner;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] Array = new int[N][2];
        for (int i=0;i<N;i++){
            Array[i][0] = sc.nextInt();
            Array[i][1] = sc.nextInt();
        }
        Arrays.sort(Array, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int Ans = 0;
        int A = 0;
        for (int j =1;j<=M;j++){

            while(A!=N&&Array[A][0]==j){
                pq.add(Array[A][1]);
                A++;
            }
            if(!(pq.isEmpty())){
            Ans += pq.remove();
            }
        }
        System.out.println(Ans);
        sc.close();
    }
}