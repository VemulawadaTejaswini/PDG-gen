import java.util.Scanner;

public class Main {

    public Main() {
    }

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().run();
    }

    private void run() {
        String s = sc.next();
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                start = i;
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'Z') {
                end = i;
                break;
            }
        }

        System.out.println(end - start + 1);
    }
}
