import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long ans = 0;
        if((H * W)%2==1)
        {
            ans = (H * W) / 2 + 1;
        }
        else
        {
            ans = (H * W) / 2;
        }
        System.out.println(ans);
    }
}
