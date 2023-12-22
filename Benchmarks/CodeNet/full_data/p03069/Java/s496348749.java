import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int white = 0;
        int black = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                white++;
            } else {
                black++;
            }
        }
        System.out.println(Math.min(white, black));
    }
}