import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int o = Integer.parseInt(sc.next());
        System.out.println(Math.min(n * m, o));
    }
}
