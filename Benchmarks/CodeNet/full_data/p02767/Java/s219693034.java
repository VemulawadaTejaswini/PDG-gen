import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            sum += x[i];
        }
        int pos = sum  / n + 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.pow((x[i] - pos), 2);
        }
        System.out.println(result);
    }

}
