import java.util.*;
import java.io.*;

public class Main {
    static void answer(long[] array){
        for(int n=0; n<array.length-1; n++){
            System.out.print(array[n]);
            System.out.print(" ");
        }
        System.out.println(array[array.length-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dam = new long[N];

        long totalRain = 0;
        for(int n=0; n<N; n++){
            dam[n] = sc.nextLong();
            totalRain += dam[n];
        }

        long[] ans = new long[N];
        long currentRain = 0;
        for(int i=1; i<N; i+=2) currentRain += dam[i]*2;
        ans[0] = totalRain-currentRain;
        for(int i=1; i<2*N; i+=2){
            currentRain -= dam[i%N]*2;
            currentRain += dam[(i-1)%N]*2;
            ans[(i+1)%N] = totalRain - currentRain;
        }
        answer(ans);
    }
}