import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count = s.length() - 2;

        System.out.printf("%s%d%s", s.charAt(0), count, s.charAt(s.length() - 1));

    }
}