
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'};
        char s = 'g';
        if (s != 'z') {
            for (int i = 0; i < 25; i++) {
                if (a[i] == s) {
                    System.out.println(a[i + 1]);
                    break;
                }
            }
        }
    }
}
