import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int a = 0;
        int z = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a == 0 && s.charAt(i) == 'A') a = i;
            if (s.charAt(i) == 'Z') z = i;
        }
        System.out.println(z - a + 1);
    }
}