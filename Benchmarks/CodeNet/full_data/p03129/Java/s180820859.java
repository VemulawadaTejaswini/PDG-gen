import java.util.Scanner;

/**
 * @author xushengbo
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        if (K * 2 - 1 <= N) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
