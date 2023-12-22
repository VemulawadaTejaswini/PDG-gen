import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int ans = 0;
        for (int i = 0 ; i < 4 ; i++) {
            String t = s.substring(i, i + 1);
            if (t.equals("+")) {
                ans++;
            } else {
                ans--;
            }
        }
        System.out.println(ans);

    }

}