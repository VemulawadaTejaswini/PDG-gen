import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong();
        Long K = scanner.nextLong();
        Long R1 = N % K;
        Long R2 = Math.abs(R1 - K);

        System.out.println(Math.min(R1,R2));
    }
}
