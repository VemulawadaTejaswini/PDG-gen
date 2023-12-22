import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c1 = sc.next().split("");
        String[] c2 = sc.next().split("");

        for (int i = 0; i < c1.length; i++) {
            if (!c1[i].equals(c2[c2.length - i - 1])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
