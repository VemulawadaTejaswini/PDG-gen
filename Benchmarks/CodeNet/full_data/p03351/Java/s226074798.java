import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        if (Math.abs(b - a) <= d && Math.abs(c - b) <= d) {
            System.out.println("Yes");
        } else if (Math.abs(c - a) <= d){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
