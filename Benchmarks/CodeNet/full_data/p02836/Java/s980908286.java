import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int length = S.length();
        int count = 0;
        for (int i = 0; i < length / 2; i++) {
            if (S.charAt(i) != S.charAt(length - 1 - i)) count++;
        }
        System.out.println(count);
    }
}