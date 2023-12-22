import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        while (s.contains("BW")) {
            s = s.replaceFirst("BW", "WB");
            ans++;
        }
        System.out.println(ans);
    }
}