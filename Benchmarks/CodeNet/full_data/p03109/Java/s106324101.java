import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if (Integer.parseInt(s.substring(5, 7)) > 4) {
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
    }
}
