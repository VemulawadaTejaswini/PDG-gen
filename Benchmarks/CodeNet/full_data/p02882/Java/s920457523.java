import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        double d = Math.toDegrees(Math.atan((a * a * b - (a * a * a) / 2.0) / x));

        System.out.println(Math.abs(d));

    }

}
