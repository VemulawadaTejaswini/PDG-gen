import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            days -= sc.nextInt();
            if (days < 0) {
                days = -1;
                break;
            }
        }
        
        System.out.println(days);
    }
}
