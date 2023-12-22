import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a >= 1000) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
    }
}
