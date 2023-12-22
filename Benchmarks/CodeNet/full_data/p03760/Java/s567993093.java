import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();
        String e = sc.nextLine();
        String ans = "";
        for (int i = 0; i < o.length(); i++) {
            ans += o.charAt(i);
            if (o.length() != e.length() && o.length() - i == 1)
                break;
            ans += e.charAt(i);
        }
        System.out.println(ans);
    }
}
