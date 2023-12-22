import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println(-1);
            return;
        }

        int count = 0;
        while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            int disA = a / 2;
            int disB = b / 2;
            int disC = c / 2;
            a = disB + disC;
            b = disA + disC;
            c = disB + disA;
            count++;
        }

        System.out.println(count);
    }
}
