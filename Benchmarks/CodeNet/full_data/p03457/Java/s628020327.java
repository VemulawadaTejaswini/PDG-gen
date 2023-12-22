import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String ans = "Yes";
        
        int p_t = 0;
        int p_x = 0;
        int p_y = 0;
        
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int diff = Math.abs(x-p_x) + Math.abs(y-p_y);
            if(diff > t-p_t || Math.abs(t-p_t - diff)%2==1){
                ans = "No";
                break;
            }
            p_t = t;
            p_x = x;
            p_y = y;
        }
        System.out.println(ans);
    }
}
