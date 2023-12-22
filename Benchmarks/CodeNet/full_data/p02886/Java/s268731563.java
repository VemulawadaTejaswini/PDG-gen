import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < d.length; i++) {
            d[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                sum += d[i] * d[j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}