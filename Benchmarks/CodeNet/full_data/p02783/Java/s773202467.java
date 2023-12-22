import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        int at = n - k;
        if (at > 0){
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(scanner.next());
            }
            a = m.sort(a);
            long atc = 0;
            for (int i = 0; i < at; i++) {
                while (a[i] > 0) {
                    a[i] = a[i] - 1;
                    atc++;
                }
            }
            System.out.println(atc);
        }else {
            System.out.println(0);
        }

    }

    public int[] sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = a.length-1; j>i; j--) {
                if (a[j] < a[j-1]) {
                    int t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            }
        }
        return a;
    }
}