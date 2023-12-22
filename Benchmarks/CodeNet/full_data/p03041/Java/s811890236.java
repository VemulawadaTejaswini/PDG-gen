import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt() - 1;

        char[] c = sc.next().toCharArray();

        if (c[k] == 'A') {
            c[k] = 'a';
        } else if (c[k] == 'B') {
            c[k] = 'b';
        } else {
            c[k] = 'c';
        }

        sc.close();

        System.out.println(c);

    }
}