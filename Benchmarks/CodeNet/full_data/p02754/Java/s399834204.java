import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        if(A==0){
            System.out.println(0);
            return;
        }
        long num = N/(A+B);
        long rem = N - num*(A+B);
        long remB = rem>=A?A:rem;
        System.out.println(num * A + remB);
    }

}
