import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long min = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;



        int cnt = 0;
        for(long i = l; i<=r; i++) {
            cnt++;
            if(cnt> 8000) break;
            long x = i%2019;
            //System.out.println(x);
            if(min >= x) {
               min2 = min;
               min = x;
            }else if(min2 > x) {
                min2 = x;
            }

        }

        long ans = (min*min2)%2019;
        cnt = 0;
        min = Long.MAX_VALUE;
        min2 = Long.MAX_VALUE;
        for(long i = l; i<=r; i++) {
            cnt++;
            if(cnt> 8000) break;
            long x = (2019-(i%2019))%2019;
            //System.out.println(x);
            if(min >= x) {
                min2 = min;
                min = x;
            }else if(min2 > x) {
                min2 = x;
            }

        }
        ans = Math.min(ans, (min*min2)%2019);
        //System.out.println(min +" " + min2);
        System.out.println(ans);
    }


}