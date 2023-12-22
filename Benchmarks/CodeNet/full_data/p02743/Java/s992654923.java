import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = c - a - b;
        boolean res = false;
        if(d <= 0) {
            res = false;
        } else {
            res = 4 * a * b < d * d;
        }

        System.out.println( res ? "Yes" : "No");
    }
}