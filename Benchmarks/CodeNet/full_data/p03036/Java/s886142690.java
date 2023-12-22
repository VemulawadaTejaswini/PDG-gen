import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[11];
        a[0] = x;
        for (int i = 0 ; i < 10 ; i++) {
            a[i + 1] = r * a[i] - d;
        }

        for (int i = 1 ; i < 11 ; i++) {
            System.out.println(a[i]);
        }
    }

}
