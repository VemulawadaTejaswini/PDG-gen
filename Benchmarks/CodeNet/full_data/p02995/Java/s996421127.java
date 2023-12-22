import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long cyaku = 0;
        long dyaku = 0;

        long max = b - a + 1;

        cyaku = (b / c) - ((a-1) / c);


        dyaku = (b / d) - ((a-1) / d);


        long yakusum = cyaku + dyaku;

        long lcm = lcm(c, d);
        yakusum -= (b / lcm) - ((a-1) / lcm);

        System.out.println(max - yakusum);
    }

    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (c/b);
    }
}