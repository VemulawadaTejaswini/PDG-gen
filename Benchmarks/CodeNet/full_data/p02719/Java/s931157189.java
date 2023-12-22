import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = Long.parseLong(scan.next());
        long K = Long.parseLong(scan.next());
        long temp = 0;

        System.out.println(Math.min(N%K, K-N%K));
        scan.close();
    }
}