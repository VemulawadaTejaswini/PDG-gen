import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long l = 0;
        long i = n / 2;
        //ここから下消すかも
        for (; i < (n + 1); i++) {
            if (n % i == 0) {
                l=i;
                break;
            }
        }
        System.out.println(l+(n/l)-2);
    }
}