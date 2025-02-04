import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        long N = getLong(vals[0]);
        long X = getLong(vals[1]);
        String[] city = sc.nextLine().split(" ");

        long minDiff = (long)Math.pow(10, 10);
        for(String val : city){
            long n = Long.parseLong(val);
            long diff = Math.abs(X - n);
            if(diff <= minDiff) minDiff = diff;
        }
        System.out.println(minDiff);
        sc.close();
    }
    static long getLong(String val) {return Long.parseLong(val);}
}