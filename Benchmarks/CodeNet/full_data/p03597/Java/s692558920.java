import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int white = scan.nextInt();
        
        int all = x * x;
        
        int ans = all - white;
        
        System.out.println(ans);
        
    }
}