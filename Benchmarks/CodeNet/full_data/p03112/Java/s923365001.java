import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int q = in.nextInt();
        TreeSet<Long> shrines = new TreeSet<Long>();
        TreeSet<Long> temples = new TreeSet<Long>();
        for( int i = 0; i < s; i++ ) shrines.add(in.nextLong());
        for( int i = 0; i < t; i++ ) temples.add(in.nextLong());
        for( int i = 0; i < q; i++ ) {
            long temp = in.nextLong();
            // ?
            long west_s = Long.MIN_VALUE, west_t = Long.MIN_VALUE, east_s = Long.MAX_VALUE, east_t = Long.MAX_VALUE;
            if( shrines.floor(temp) != null ) west_s = shrines.floor(temp);
            if( shrines.ceiling(temp) != null ) east_s = shrines.ceiling(temp);
            if( temples.floor(temp) != null ) west_t = temples.floor(temp);
            if( temples.ceiling(temp) != null ) east_t = temples.ceiling(temp);
            long ans = Long.MAX_VALUE;
            if( west_s > west_t ) {
                ans = Math.min(ans, Math.abs(temp-west_s+east_t-west_s));
                ans = Math.min(ans, Math.abs(temp-west_t));
            } else {
                ans = Math.min(ans, Math.abs(temp-west_t+east_s-west_t));;
                ans = Math.min(ans, Math.abs(temp-west_s));
            }
            if( east_s < east_t ) {
                ans = Math.min(ans, Math.abs(east_s-temp+east_s-west_t));
                ans = Math.min(ans, Math.abs(east_t-temp));
            } else {
                ans = Math.min(ans, Math.abs(east_t-temp+east_t-west_s));
                ans = Math.min(ans, Math.abs(east_s-temp));
            }
            System.out.println(ans);
        }
    }
}