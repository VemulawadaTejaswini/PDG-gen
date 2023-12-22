import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (!s.contains("KI") || s.contains("AA")) {
            System.out.println("NO");
            return;
        }
        s = s.replaceAll("A", "");
        if (s.equals("KIHBR")) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
