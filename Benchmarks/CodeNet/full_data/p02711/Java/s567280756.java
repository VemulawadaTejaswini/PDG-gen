import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(sc.next());
        String s = sc.next();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = Integer.parseInt(sc.next());
        // }

        if (s.charAt(0) == '7' || s.charAt(1) == '7'|| s.charAt(2) == '7') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // System.out.println(s);
        sc.close();
    }
}