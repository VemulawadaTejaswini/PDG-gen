import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        String[] tmp = in.nextLine().split(" ");
        int[] ary = new int[n+1];
        for( int i = 1; i <= n; i++ ) ary[i] = Integer.parseInt(tmp[i-1]);
        int ans = 0;
        for( int i = 1; i < n+1; i++ ) {
            if( ary[i]-ary[i-1]>0 ) ans += ary[i]-ary[i-1];
        }
        System.out.println(ans);
    }
}