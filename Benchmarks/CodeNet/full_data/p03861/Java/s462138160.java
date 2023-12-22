import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long countA = a ==0 ? 0 : (a-1)/x+1;
        long countB = b ==0 ? 0 : b/x+1;
        System.out.println(countB-countA);

    }
}
