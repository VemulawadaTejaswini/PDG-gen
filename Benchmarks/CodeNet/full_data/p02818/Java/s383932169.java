import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long ans = Math.min(a, c);
        a -= ans;
        c -= ans;

        long tmp = Math.min(b, c);
        ans += tmp;
        b -= tmp;
        System.out.println(a + " " + b);
        
    }
}