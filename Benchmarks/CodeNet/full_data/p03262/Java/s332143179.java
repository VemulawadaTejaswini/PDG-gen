import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        long N = getLong(vals[0]);
        long X = getLong(vals[1]);
        String[] city = sc.nextLine().split(" ");

        // 出発地との最小の差を取得する
        long minDiff = (long)Math.pow(10, 10);
        for(String val : city){
            long n = Long.parseLong(val);
            long diff = Math.abs(X - n);
            if(diff <= minDiff && diff != 0) minDiff = diff;
        }

        //　割り切れないものが割り切れるまで-1し続ける
        for(int i = 0;i < N;i++) {
            for (String val : city) {
                long n = Long.parseLong(val);
                long diff = Math.abs(X - n);
                while (diff % minDiff != 0) {
                    minDiff = minDiff - 1;
                }
            }
        }
        System.out.println(minDiff);
        sc.close();
    }
    static long getLong(String val) {return Long.parseLong(val);}
}