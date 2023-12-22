import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        if (M/2 <= N) {
            System.out.println(M/2);
        } else {
            long resM = M-(N*2);
            System.out.println(resM/4+N);
        }
    }
}
