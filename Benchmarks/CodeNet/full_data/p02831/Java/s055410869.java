import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(lcm(A, B));

        sc.close();
    }

    public static int lcm(int a, int b) {
        int maxVal = Math.max(a, b);
        int minVal = Math.min(a, b);

        int tmp;
        while ((tmp = maxVal % minVal) != 0) {
            maxVal = minVal;
            minVal = tmp;
        }

        return a * b / minVal;
    }
}