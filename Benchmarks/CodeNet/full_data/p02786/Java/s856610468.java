import java.util.*;

public class Main {
    static long f(long x) {
        if (x==1) return 1;
        else return f(x/2)+f(x/2)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        System.out.println(f(H));
    }
}