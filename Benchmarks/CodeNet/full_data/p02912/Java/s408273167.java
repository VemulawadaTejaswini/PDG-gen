import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int M = scan.nextInt();
        long result = 0;
        long temp = 0;
        PriorityQueue<Long> a = new PriorityQueue<Long>(N, Collections.reverseOrder());
        for(int i = 0;i < N; i++){
            a.add(scan.nextLong());
        }
        scan.close();
        while(M > 0){
            // 最大値を取得して割る2
            temp = a.poll();
            a.add(temp / 2);
            M--;
        }
        Long[] arrayA = a.toArray(new Long[0]);
        for(int i = 0; i < N; i++){
            result += arrayA[i];
        }
        System.out.println(result);
    }
}
