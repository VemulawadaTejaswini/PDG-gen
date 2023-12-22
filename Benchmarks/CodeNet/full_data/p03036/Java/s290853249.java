import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt(), d = in.nextInt(), x = in.nextInt();
        for (int i = 0; i < 10; i++) {
            int next = r * x - d;
            System.out.println(next);
            x = next;
        }
    }
}
