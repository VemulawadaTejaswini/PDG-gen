import java.util.Scanner;

/**
 * Created by codoge on 2017/6/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0)
            System.out.println("0 0");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        printColors(a);
    }

    private static void printColors(int[] a) {
        int have = 0, free = 0;
        int[] color = new int[8];
        for (int i = 0; i < a.length; i++) {
            if (a[i]/400 >= 8) {
                free++;
            }else if (color[a[i]/400] == 0) {
                color[a[i]/400] = 1;
                have++;
            }
        }
        System.out.print(have+ " ");
        System.out.println(have+free);

    }
}
