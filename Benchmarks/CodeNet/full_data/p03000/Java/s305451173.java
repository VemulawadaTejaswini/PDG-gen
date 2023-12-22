import java.util.Scanner;
public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        int d = 0;
        int counter = 1;
        for (int i = 0; i < l.length; i++) {
            d += l[i];
            if (d <= x) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}