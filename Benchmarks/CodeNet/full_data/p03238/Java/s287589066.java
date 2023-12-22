import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a == 1) {
            System.out.println("Hello World");
        } else {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            System.out.println(b + c);
        }
    }
}
