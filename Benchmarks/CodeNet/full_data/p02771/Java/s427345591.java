import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];

        for(int i=0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        if (a[1] == a[2] && a[1] == a[3]) {
            System.out.println("No");
        }
        else if (a[1] != a[2] && a[2] != a[3] && a[1] != a[3]) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}
