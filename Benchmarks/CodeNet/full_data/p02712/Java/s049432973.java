import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
