import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] counters = new long[100005];

        for(int i = 0; i < n; ++i){
            int a = sc.nextInt();
            long b = sc.nextLong();
            counters[a] += b;
        }

        long cnt = 0;
        for(int i = 1; i <= 100000; ++i){
            cnt += counters[i];
            if(cnt >= k){
                System.out.println(i);
                break;
            }
        }
    }
}