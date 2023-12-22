import java.util.*;
import java.util.stream.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int mod = (int)1e9 + 7;

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt()-1;
        if (b % (a - 1) == 0) {
            System.out.println(b / (a - 1));
        } else {
            System.out.println(b / (a - 1) + 1);
        }
    }

}
