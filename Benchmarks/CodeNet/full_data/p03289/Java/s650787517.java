import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'C') cnt++;
        }
        if (cnt == 0 || cnt > 1 || str.charAt(length - 1) == 'C' || str.charAt(0) == 'C' || str.charAt(1) == 'C') {
            System.out.println("WA");
            return;
        } else if (str.charAt(0) == 'A' && str.substring(1, length - 1).contains("C") ) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}