import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] == i + 1) {
                continue;
            }
            count++;
        }
        if (count > 2) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }

}

