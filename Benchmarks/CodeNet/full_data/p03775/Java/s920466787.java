import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        int answer = Integer.MAX_VALUE;
        long left = 1;
        long right = N;
        long divider = 2;
        while (left <= right) {
            if (right % divider == 0) {
                left *= divider;
                right /= divider;
            } else {
                divider += 1;
            }
            int diff = Math.max(digitLength(left), digitLength(right));
            if (answer > Math.max(digitLength(left), digitLength(right))) {
                answer = diff;
            }

        }

        System.out.println(answer);


    }

    private static int digitLength(long i) {
        return Long.toString(i).length();
    }

}