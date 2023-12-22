import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[32];
        for (int i = 0; i < 32; i++) {
            if (n % 2 != 0) {
                a[i] = 1;
                n = (n - 1) / (-2);
            } else {
                n /= (-2);
            }
        }
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if (a[31 - i] != 0) {
                index = 31 - i;
                break;
            }
        }
        for (int i = 0; i <= index; i++) {
            System.out.print(a[index - i]);
        }
        System.out.println();
    }
}