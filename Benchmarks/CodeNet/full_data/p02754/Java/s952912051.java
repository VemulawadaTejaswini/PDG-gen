import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        long shou = N / (A + B);
        long amari = N % (A + B);
        if(amari >= A) {
            System.out.println(shou * A + A);
        }else {
            System.out.println(shou * A + amari);
        }
    }
}