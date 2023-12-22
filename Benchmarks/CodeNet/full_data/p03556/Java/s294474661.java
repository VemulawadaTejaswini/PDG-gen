import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 40000; i > 1; i--) {
            if (i * i <= n) {
                System.out.println(i * i);
                return;
            }
        }
        System.out.println(1);
    }
}