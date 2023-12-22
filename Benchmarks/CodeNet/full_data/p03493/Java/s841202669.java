import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int total = 0;
        total += s.charAt(0) == '1' ? 1 : 0;
        total += s.charAt(1) == '1' ? 1 : 0;
        total += s.charAt(2) == '1' ? 1 : 0;
        System.out.println(total);

    }
}
