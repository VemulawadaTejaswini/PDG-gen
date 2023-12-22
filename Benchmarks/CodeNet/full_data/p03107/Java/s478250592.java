import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        while(true) {
            String ss = s;
            s = s.replaceFirst("01", "");
            if(!ss.equals(s)) {
                ans += 2;
                continue;
            }
            s = s.replaceFirst("10", "");
            if(!ss.equals(s)) {
                ans += 2;;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}