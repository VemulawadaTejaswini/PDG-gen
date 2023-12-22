import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        int X;
        int x = 0;
        for (X = 1; X <= N; X++) {
            x = scan.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }
}
