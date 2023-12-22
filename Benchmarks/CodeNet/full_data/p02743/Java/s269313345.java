import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long temp = a*a+b*b+c*c-2*(a*b+a*c+b*c);
        System.out.println(0<temp?"Yes":"No");


    }
}
