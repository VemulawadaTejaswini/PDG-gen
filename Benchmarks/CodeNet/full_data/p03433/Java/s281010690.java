import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int coin_1 = sc.nextInt();
        
        System.out.println(coin_1 > n % 500 ? "Yes" : "No");
    
    }
}
