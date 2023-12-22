import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        long[] map = new long[100001];
        int n = sc.nextInt();
        long k = sc.nextLong();
        for(int i = 0; i < n; i++){
            map[sc.nextInt()] += sc.nextInt();
        }
        for(int i = 1; i <= n; i++){
            k -= map[i];
            if(k <= 0){
                System.out.println(i);
                return;
            }
        }
    }
}
