import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
        }
        System.out.println(max - min);
    }
}