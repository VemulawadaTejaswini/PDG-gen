
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = Integer.parseInt(str);
        if ((num % S(str)) == 0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static int S(String str) {
        int result = 0;
        for (int ct = 0; ct < str.length(); ct++) {
            result += Integer.parseInt(str.charAt(ct) + "");
        }
        return result;
    }
}