import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        if(num%2==1&&num2%2==1)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
}
