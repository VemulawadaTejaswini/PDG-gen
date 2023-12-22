import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            String t = sc.next();

            boolean isOk = false;
            for (int i = 0; i < s.length(); i++) {
                boolean tmpFlag = true;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) != t.charAt((j + i) % s.length())) {
                        tmpFlag = false;
                        break;
                    }
                }
                if (tmpFlag) {
                    isOk = true;
                    break;
                }
            }

            if (isOk) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
