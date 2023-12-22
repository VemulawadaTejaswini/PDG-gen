import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if (a>0) {
            if (a>k){
                a -= k;
            }else {
                k -= a;
                a = 0;
                b = Math.max(b-k, 0);
            }
        }else {
            b = Math.max(b-k, 0);
        }

        System.out.println(a+" "+b);

    }
}