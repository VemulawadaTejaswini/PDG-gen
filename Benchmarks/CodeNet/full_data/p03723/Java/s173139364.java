import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (a == b && b == c) {
            System.out.println(-1);
            return;
        }

        int count = 0;
        while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            long disA = a / 2;
            long disB = b / 2;
            long disC = c / 2;
            a = disB + disC;
            b = disA + disC;
            c = disB + disA;
            count++;
        }

        System.out.println(count);
    }
}
