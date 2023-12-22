import java.util.*;
import java.io.*;


public class Main {

    static int roundUp(int N){
        return (N+9)/10*10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] dish = new int[N];
        for(int n=0; n<N; n++) dish[n] = sc.nextInt();

        int ans = 0;
        int last = 0;
        for(int d:dish){
            ans += roundUp(d);
            last = Math.max(last, roundUp(d)-d);
        }
        System.out.println(ans-last);



    }
}
