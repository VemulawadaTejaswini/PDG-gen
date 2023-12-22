import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=9;i++)
        {
            if(num%i==0)
            {
                if(num/i<10)
                {
                    sum++;
                }
            }
        }
        if(sum==0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}

