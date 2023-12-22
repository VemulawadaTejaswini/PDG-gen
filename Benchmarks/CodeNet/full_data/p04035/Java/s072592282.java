import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int l = sc.nextInt();
        int [] a = new int [n];
        long total = 0; boolean ok = false; int stor = -1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); total += a[i];
            if (i != 0) {
                if (a[i] + a[i-1] >= l) {
                    stor = i - 1; ok = true;
                }
            }
        }
        if (!ok) System.out.println("Impossible");
        else {
            System.out.println("Possible");
            for (int i = 0; i < stor; i++) {
                System.out.println(i + 1);
            }
            for (int i = n - 1; i > stor + 1; i--) {
                System.out.println(i);
            }
            System.out.println(stor + 1);
        }
    }


}