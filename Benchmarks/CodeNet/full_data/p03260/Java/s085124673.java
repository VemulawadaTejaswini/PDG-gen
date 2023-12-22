import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if(A*B%2 == 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}