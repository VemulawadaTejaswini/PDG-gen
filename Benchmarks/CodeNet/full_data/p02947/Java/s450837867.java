import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String d[] = new String[n];
        for (int i = 0; i < n; i++) {
            String[] c = scanner.nextLine().split("");
            Arrays.sort(c);
            d[i] = String.join("", c);
        }
        scanner.close();

        Arrays.sort(d);

        int c = 0;
        int a = 0;
        for (int i = 0; i < d.length; i++) {
            if (i == d.length - 1) {
                c += addCount(a);
            } else {
                if (d[i].equals(d[i + 1])) {
                    a++;
                } else {
                    c += addCount(a);
                    a = 0;
                }
            }
        }
        
        System.out.println(c);
    }

    private static int addCount(int n) {
        int tmp = 0;
        for (int i = 1; i <= n; i++) {
            tmp += i;
        }
        return tmp;
    }
}