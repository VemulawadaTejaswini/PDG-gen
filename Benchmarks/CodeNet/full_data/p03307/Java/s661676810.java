import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a % 2 == 0) {
            System.out.println(a);
        } else {
            System.out.println(a * 2);
        }
    }
}
