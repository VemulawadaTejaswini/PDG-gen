import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(Math.min(
                    a*x+b*y,
                    Math.min( (x < y)?2*c*x+b*(y-x):2*c*y+a*(x-y),
                    Math.max(x,y)*2*c)));
            }
        }
    }
}