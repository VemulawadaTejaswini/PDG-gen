import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num - num2*2;
        if(sum<=0)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(sum);
        }
            
    }
}
