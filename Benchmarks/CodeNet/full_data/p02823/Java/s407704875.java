import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        sc.close();
        if ((min - max) % 2 == 0) {
            System.out.println((max - min) / 2);
            return;
        }
        // 奇数の場合
        long right = n - max;
        long left = min - 1;
        if (right > left) {
            min = 1;
            max -= left;
            long ans = left + (max / 2);
            System.out.println(ans);
        } else {
            max = n;
            min += right;
            long ans = right + 1 + ((max - (min + 1)) / 2);
            System.out.println(ans);
        }
    }
}
