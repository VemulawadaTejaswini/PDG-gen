import java.util.*;

public class Test {
    public static void main(String[] args) {
        if (args.length == 3) {

            int cnt = 0;
            for (int i = 0; i < args.length; i++) {
                cnt = cnt + Integer.parseInt(args[i]);
            }
            if (cnt <= 21) {
                System.out.println("win");
            } else if (cnt >= 22) {
                System.out.println("bust");
            }
        }
    }
}