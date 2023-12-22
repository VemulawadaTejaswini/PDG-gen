import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a + b + c <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}