import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long count = 0;
        while(y >= x) {
            y /= 2;
            count++;
        }
        System.out.println(count);
    }
}
