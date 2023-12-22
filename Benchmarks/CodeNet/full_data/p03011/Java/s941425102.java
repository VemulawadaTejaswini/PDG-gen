import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
        int sum = p + q + r;
        int[] hoge = {p, q, r};
        System.out.println(Arrays.stream(hoge).map(operand -> sum - operand).min().getAsInt());
    }
}