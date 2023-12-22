import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hati = sc.nextInt();
        int zyuu = sc.nextInt();
        int ans = -1;
        int N = (int)(zyuu/0.1);
        for(int i=N; i<=100; i++){
            int A = (int)(i*0.08);
            int B = (int)(i*0.1);
            if(hati == A && zyuu == B){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
