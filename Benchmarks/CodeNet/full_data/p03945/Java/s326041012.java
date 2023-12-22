import java.util.Scanner;

public class Main {
    static char[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.next().toCharArray();
        char n = c[0];
        int count = 0;
        for (int i = 1; i < c.length; i++) {
            if (n != c[i]) {
                count++;
                n = c[i];
            }
        }
        System.out.println(count);
    }
}