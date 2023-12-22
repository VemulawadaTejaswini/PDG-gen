import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] cs = s.toCharArray();

        int x = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (cs[i] == 'I') {
                x++;
            } else {
                x--;
            }

            max = Math.max(x, max);
        }
        System.out.println(max);
    }
}
