import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int dest = s.indexOf("B");
        int index = 0;
        int nowIndex;
        while ((nowIndex = s.indexOf("BW", index) + 1) > 0) {
            ans += nowIndex - dest++;
            index = nowIndex;
        }
        System.out.println(ans);
    }
}