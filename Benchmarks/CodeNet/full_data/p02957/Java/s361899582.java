import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextInt();
        long a1=a/2;
        long b1=b/2;
        long sum=a1+b1;
        if ( Math.abs(a-sum) == Math.abs(b-sum)) {
            System.out.println(sum);
        }
        else System.out.println("IMPOSSIBLE");
    }
}
