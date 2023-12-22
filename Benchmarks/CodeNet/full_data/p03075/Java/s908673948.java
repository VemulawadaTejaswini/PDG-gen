import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int e = Integer.parseInt(sc.next());
        int f = Integer.parseInt(sc.next());

        if ((e - a) < f) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
