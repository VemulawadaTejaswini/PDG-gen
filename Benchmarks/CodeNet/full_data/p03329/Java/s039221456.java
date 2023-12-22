import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double m = n;
        int c = 0;
        int i;

        while (m >= 6) {
            i = 1;
            while(m >= Math.pow(9, i)) {
                i++;
            }

            double x = Math.pow(9, i-1);

            i = 1;
            while (m >= Math.pow(6, i)) {
                i++;
            }

            double y = Math.pow(6, i-1);

            if (x > y) {
                m = m - x;
            } else {
                m = m - y;
            }

            c++;
        }

        c += m;

        System.out.println(c);
    }
}
