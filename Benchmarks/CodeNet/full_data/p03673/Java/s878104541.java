import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        if (n != 1) {
        for (int i = n - 1; i >= 0; i = i - 2) {
            System.out.print(a[i] + " ");
        }
        int s = (n % 2 == 0 ? 0 : 1);

        for (int i = s; i < n - 2; i = i + 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - 2]);
    }else{
            System.out.println(a[0]);
        }
}

}