import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A+B+C<=21)
        {
            System.out.println("win");
        }
        else
        {
            System.out.println("bust");
        }
    }
}