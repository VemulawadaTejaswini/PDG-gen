import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        
        if(B%A == 0) {
            ans = B/A;
        } else {
            ans = (B/A) + 1;
        }
        
        System.out.println(ans);
        
        
        
        
    }
}
