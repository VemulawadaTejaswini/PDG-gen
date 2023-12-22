import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        String y = scan.next();
        long X = Long.parseLong(x);
        long Y = Long.parseLong(y);
        long ans = 0;
        long i = X;
        while(i <= Y){
            //System.out.println(i);
            ans++;
            i = i*2;
        }
        System.out.println(ans);
    }
}
