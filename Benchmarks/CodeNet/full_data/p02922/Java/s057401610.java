import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        B -= 1;
        for (;;ans++){
            if (B <1)break;
            B -= (A-1);
        }
        System.out.printf("%d\n",ans);
        
    }
}
