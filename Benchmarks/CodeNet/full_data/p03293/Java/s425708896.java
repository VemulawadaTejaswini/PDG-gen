import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String u = s+s;
        if (u.contains(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}