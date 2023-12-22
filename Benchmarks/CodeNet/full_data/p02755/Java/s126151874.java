import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hati = sc.nextInt();
        int zyuu = sc.nextInt();
        int ans = -1;
        for(int i=1; i<=100; i++){
            double A = i*0.08;
            double B = i*0.1;
            if(hati == (int)A && zyuu == (int)B){
                ans = i;
                break;
            }
        }
        
        System.out.println(ans);
        
    }
}