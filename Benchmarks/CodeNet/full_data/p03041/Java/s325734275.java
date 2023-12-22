import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = Integer.parseInt(a.split(" ")[0]);
        int k = Integer.parseInt(a.split(" ")[1]);

        String s = sc.nextLine();
        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            if (k == i + 1) {
                ans[i] = s.toLowerCase().charAt(i);
            } else {
                ans[i] = s.charAt(i);
            }
        }

        System.out.println(ans);

        return;
    }
}
