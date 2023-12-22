import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long h = sc.nextLong();
        Long w = sc.nextLong();
        Long res = h * w;
        if (h % 2 != 0 && w % 2 != 0) {
            System.out.println(res + 1);
        } else {
            System.out.println(res);
        }
    }
}