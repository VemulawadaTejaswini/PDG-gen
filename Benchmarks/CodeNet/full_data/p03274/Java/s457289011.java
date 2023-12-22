import java.io.FileInputStream;
import java.util.Scanner;
public class Main{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] candles = new int[N];
        for(int i = 0; i < N; i++)  candles[i] = sc.nextInt();
        
        int temp = 0, time = Integer.MAX_VALUE;

        for(int i = 0; i < N - K; i++){
                int j = i+K-1;
                temp = Math.min(Math.abs(candles[i]), Math.abs(candles[j])) + candles[j] - candles[i];
                time = time < temp ? time : temp;
        }
         if(N - K == 0) time = candles[N-1] - candles[0];
         System.out.println(time); 
}