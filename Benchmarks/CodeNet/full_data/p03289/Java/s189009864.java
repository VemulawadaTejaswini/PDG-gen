import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if (S.matches("A[a-z]+C[a-z]+")) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}