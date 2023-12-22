import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int ave = sum / n;

        if (Math.abs(sum) % 2 == 1) {
            if (ave > 0) {
                ave++;
            } else if (ave < 0) {
                ave--;
            }
        }

        int result = 0;
        for (int num : a) {
            result += Math.abs(num - ave) * Math.abs(num - ave);
        }

        System.out.println(result);
    }
}
