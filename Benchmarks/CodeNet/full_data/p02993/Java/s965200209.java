
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String res = (S.charAt(0) == S.charAt(1)) || (S.charAt(1) == S.charAt(2)) || (S.charAt(2) == S.charAt(3)) ? "Bad" : "Good";
        System.out.println(res);
    }
}
