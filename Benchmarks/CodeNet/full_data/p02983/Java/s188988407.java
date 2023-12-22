
import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();

        long min = INF1;
        for(long tmp = l; tmp<=r ; tmp++){
            long diff = tmp % 2019;
            if(diff < min) {
                min = diff;
            }
        }
        long result = INF1;
        if(min - 1 >= l && min + 1 <= r){
             long x = (min * (min + 1)) % 2019;
             long y = (min * (min -1)) % 2019;
             result = Math.min(x,y);
        }else if(min - 1 >= l && min + 1 > r){
            result = (min * (min -1)) % 2019;
        }else if(min - 1 < l && min + 1 <= r){
            result = (min * (min + 1)) % 2019;
        }
        System.out.println(result);
    }
}
