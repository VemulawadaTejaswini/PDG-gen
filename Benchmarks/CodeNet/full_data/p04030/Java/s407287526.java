import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for (int i = 0 ; i < s.length() ; i++) {
            String c = s.substring(i, i + 1);
            if (c.equals("B") && ans.length() > 0){
                ans = ans.substring(0, ans.length() - 1);
            } else if (c.equals("0")) {
                ans += "0";
            } else if (c.equals("1")) {
                ans += "1";
            }
        }
        System.out.println(ans);
    }

}