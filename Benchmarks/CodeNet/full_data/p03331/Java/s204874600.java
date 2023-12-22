import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();

        int result = 0;
        for (int i = 0; i < 6; i++) {
            result += N % 10;
            N = (N - (N % 10)) / 10;
        }
        if (result == 1) result = 10;
        System.out.println(result);
    }
}
