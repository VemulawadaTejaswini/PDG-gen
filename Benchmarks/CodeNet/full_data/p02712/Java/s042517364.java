import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i<=n; i++) {
            if(i%3!=0 && i%5!=0) sum += i;
        }
        p(sum);
    }

    public static <T> void p(T message) {
        System.out.println(message);
    }

    public static <T> void pp(T message) {
        System.out.print(message);
    }
}