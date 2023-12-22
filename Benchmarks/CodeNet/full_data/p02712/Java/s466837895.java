import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(),x = 0;
        long b = a / 15;
        long c = a / 5;
        long d = a / 3;
        for (int i = 1; i <= a; i++) {
            if(i % 3 == 0)continue;
            if(i % 5 == 0)continue;
            x += i;
        }
        System.out.println(x);
    }
}
