import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();        
        int ans = 0;
        
        //椅子幅N・人幅Y・心の距離Zは、常に以下の式が成り立つ。
        while((ans + 1) * (Y + Z) + Z  <= N){
            ans++;
        }
        System.out.println(ans);
    }
}
