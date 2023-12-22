import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int shou = N / (A + B);
        int amari = N % (A + B);
        if(amari >= A) {
            System.out.println(shou * A + A);
        }else {
            System.out.println(shou * A + amari);
        }
    }
}