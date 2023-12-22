import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String c = "";
        String d = "";

        for (int i = 0; i < a; i++) {
            c += b;
        }

        for (int i = 0; i < b; i++) {
            d += a;
        }

        System.out.println(c.compareTo(d) > 0 ? d : c);
    }
}
