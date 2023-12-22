import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextDouble();
        int b = sc.nextDouble();
        int c = sc.nextDouble();
        String ans = "No";
        if (a + b < c)
            ans = "Yes";
        System.out.println(ans);
    }
}

