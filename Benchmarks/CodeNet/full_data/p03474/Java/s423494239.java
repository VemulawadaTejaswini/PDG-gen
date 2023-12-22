import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String s = sc.next();
        if (s.charAt(A) == '-' && s.replace("-", "").length() == A + B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}