import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int lastClose = s.lastIndexOf(')');
        lastClose = lastClose == -1 ? n : lastClose;

        int firstOpen = s.indexOf('(');
        firstOpen = firstOpen == -1 ? 0 : firstOpen;

        int head = 0;
        for (int i = 0; i <= lastClose; i++) {
            head += (s.charAt(i) == ')') ? 1 : -1;
        }
        head = Math.max(0, head);

        int foot = 0;
        for (int i = n - 1; i >= firstOpen; i--) {
            foot += (s.charAt(i) == '(') ? 1 : -1;
        }
        foot = Math.max(0, foot);

        for (int i = 0; i < head; i++) {
            System.out.print("(");
        }
        System.out.print(s);
        for (int i = 0; i < foot; i++) {
            System.out.print(")");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
