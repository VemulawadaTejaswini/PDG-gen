import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        for (char a : N.toCharArray()) {
            if (a == '7') {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}