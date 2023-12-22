import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int remainTank2 = Math.max(C - Math.max(A - B, 0), 0);
        System.out.println(remainTank2);
    }
}
