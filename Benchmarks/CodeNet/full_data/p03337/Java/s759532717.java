import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int x = A + B;
        int y = A - B;
        int z = A * B;
        
        int ans = Math.max(x, Math.max(y, z));
        System.out.println(ans);
    }
}
