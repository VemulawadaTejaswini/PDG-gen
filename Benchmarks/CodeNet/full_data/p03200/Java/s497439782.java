import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] str = s.split("");

        sc.close();

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.indexOf("BW");
            str[idx] = "W";
            str[idx + 1] = "B";
            s = String.join("", str);
            ans++;
        }

        System.out.println(ans);
    }
}
