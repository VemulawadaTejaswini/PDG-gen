import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a;

        boolean isYes = false;
        if(a % 2 == 0 && b % 2 == 0) {
            if(c == 0) {
                isYes = true;
            } else {
                System.out.println("NO");
                return;
            }

        }
        int mod = 0;
        while (!isYes) {
            mod = result % b;
            if (mod == c) {
                isYes = true;
                break;
            }
            result += a;
        }

        if (isYes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}