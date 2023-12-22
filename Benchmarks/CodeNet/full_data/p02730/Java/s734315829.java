import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int len = str.length();
        if (len % 2 == 0) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < len/2; i ++){
            if (str.charAt(i) != str.charAt(len - i - 1)){
                System.out.println("No");
                return;
            }
        }
        for (int i = 0; i < (len - 1)/2; i ++){
            if (str.charAt(i) != str.charAt(len/2 - i - 1)){
                System.out.println("No");
                return;
            }
        }
        for (int i = (len+3)/2 - 1; i < len; i ++){
            if (str.charAt(i) != str.charAt(len - i - 1)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

}
