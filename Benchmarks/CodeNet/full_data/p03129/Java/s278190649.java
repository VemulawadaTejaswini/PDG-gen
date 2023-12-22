import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n - k > 0) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
