
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "NO";
        if (n == 7 || n == 5 || n == 3)
            ans = "YES";
        System.out.println(ans);
    }

}
