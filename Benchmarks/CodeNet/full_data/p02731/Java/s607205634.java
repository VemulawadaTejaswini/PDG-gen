import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int taiseki = sc.nextInt();
        int max = Integer.MAX_VALUE;
        int ans = taiseki/3;
        int ans2 = ans * ans * ans;
        System.out.println(ans2);
    }
}
