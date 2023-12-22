import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i = 0; i < S.length(); i++) {
            System.out.printf("%c",'x');
        }
        return;
    }
}