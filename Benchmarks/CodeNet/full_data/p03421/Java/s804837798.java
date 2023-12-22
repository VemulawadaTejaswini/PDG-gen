import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a + b  > n + 1 || a * b < n) {
            System.out.println(-1);
            return;
        }
        int c = 0;
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i <= a; i++) {
            int num =  Math.min(n - c - (a - i), b);
            for (int j = 0; j < num; j++) {
                assert s.contains(c + num - j);
                s.add(c + num - j);
                System.out.print(c + num - j + " ");
            }
            c += num;
        }
        System.out.println();
    }
}
