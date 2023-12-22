import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        sc.close();
        int ans = h%a==0 ? h/a : h/a+1;
        System.out.println(ans);
        
    }
}
