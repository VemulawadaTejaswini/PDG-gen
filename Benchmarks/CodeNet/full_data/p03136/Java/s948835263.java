import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
            max = Math.max(max, num);
        }

        System.out.println(max < sum-max ? "Yes" : "No");
    }
}