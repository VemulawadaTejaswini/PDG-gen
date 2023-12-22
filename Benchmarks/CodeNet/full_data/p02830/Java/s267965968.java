import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        for (int i = 0; i < n; i++) {
            System.out.print(s.charAt(i));
            System.out.print(t.charAt(i));
        }
    }
}
