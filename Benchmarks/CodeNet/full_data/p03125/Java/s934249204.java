import java.util.Scanner;

/**
 * @author shengboxu
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        
        if (B % A  == 0) {
            System.out.println(A+B);
        } else {
            System.out.println(B-A);
        }
    }
}
