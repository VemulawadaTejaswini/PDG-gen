
import java.util.*;
import java.lang.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i <= N; i *= 2) {
            if (i >= N) {
                System.out.println(i);
                return;
            }
        }
    }
}