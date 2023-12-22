import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        for (int i = 0; i < c.length; i++) {
            int d  = (int)c[i] + n;
            if (d > 'Z') d -= 26;
            System.out.print(Character.toChars(d));
        }
    }
}

