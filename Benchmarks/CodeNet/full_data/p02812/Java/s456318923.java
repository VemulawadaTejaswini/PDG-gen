import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        s = s.replaceAll("ABC", "");
        int ans = (n - s.length()) / 3;

        System.out.println(ans);
    }
}