import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        long ans = N / (A + B) * A;
        long amari = N % (A + B);
        if(amari >= A) {
            System.out.println(ans + A);
        }else {
            System.out.println(ans + amari);
        }
    }
}