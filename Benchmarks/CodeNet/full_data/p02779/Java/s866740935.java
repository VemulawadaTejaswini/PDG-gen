import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list[i] = a;
            for (int j = 0; j < i; j++) {
                if (list[j] == a) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}