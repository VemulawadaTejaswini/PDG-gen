import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int total = 700;
        total += s.charAt(0) == 'o' ? 100 : 0;
        total += s.charAt(1) == 'o' ? 100 : 0;
        total += s.charAt(2) == 'o' ? 100 : 0;
        System.out.println(total);
    }
}
