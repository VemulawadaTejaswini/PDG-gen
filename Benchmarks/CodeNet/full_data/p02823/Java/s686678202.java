import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());

        if ((B-A)%2==0) System.out.println((B-A)/2);
        else System.out.println(Math.min(A-1, N-B)+(B-A+1)/2);
    }
}