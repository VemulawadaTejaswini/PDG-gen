import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A1 = stdIn.nextInt();
        int B = stdIn.nextInt();
        int C = stdIn.nextInt();
        stdIn.close();
 
        if (A1 == B && B != C) {
            System.out.println("Yes");
        } else if(A1== C && B != C) {
            System.out.println("Yes");
        } else if(B == C && A1 != C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}