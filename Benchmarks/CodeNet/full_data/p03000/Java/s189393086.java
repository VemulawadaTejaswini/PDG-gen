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
        int counter = 0;
        for (int i = 0; i < l.length; i++) {
            if (d <= x) {
                counter++;
            }
            d += l[i];
        }
        System.out.println(counter);
        sc.close();
    }
}