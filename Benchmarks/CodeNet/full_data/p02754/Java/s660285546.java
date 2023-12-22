import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long num = N/(A+B);
        if(A==0){
            System.out.println(0);
            return;
        }
        System.out.println(num * A + (N - ((A+B)*num))%A);
    }

}
