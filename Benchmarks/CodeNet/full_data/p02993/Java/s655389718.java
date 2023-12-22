import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        Character s = null;
        for (Character si : S.toCharArray()) {
            if (s == si) {
                System.out.println("Bad");
                return;
            }
            s = si;
        }
        System.out.println("Good");
    }

}
