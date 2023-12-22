import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long next = x ;
        int count = 0;
        while (next <= y) {
            next *= 2;
            count++;
        }
        System.out.println(count);
    }
}
