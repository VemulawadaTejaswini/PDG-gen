import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC152B - Comparing Strings

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String sa = "";
        String sb = "";

        for (int i = 0; i < b; i++) {
            sa += a;
        }

        for (int i = 0; i < a; i++) {
            sb += b;
        }

//        System.out.println((sa.compareTo(sb) == -1) ? sa : sb);
        System.out.println((a < b) ? sa : sb);
    }
}