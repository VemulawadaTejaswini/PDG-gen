import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean out = false;
        if(a == b && b != c) out = true;
        if(b == c && a != c) out = true;
        if(c == a && a != b) out = true;
        System.out.println(out ? "Yes" : "No");
    }
}