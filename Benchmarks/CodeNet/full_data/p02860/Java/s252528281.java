import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        String[] c = b.split("");
        String d = "";
        String e = "";
        if (a != c.length) {
            System.out.println("No");
        } else {
            for (int i = 0; i < a / 2; i++) {
                d += c[i];
            }
            for (int j = a / 2; j <= a - 1; j++) {
                e += c[j];
            }
            System.out.println(d);
            System.out.println(e);
            if (d.equals(e)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

