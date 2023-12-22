import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = Math.max(a, c);
        int e = Math.min(b, d);
        if (e - s >= 0)
            System.out.println(e - s);
        else
            System.out.println(0);
    }
}
