import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt(); // 青のボール
        int b = sc.nextInt();
        String balls = "";
        String flg = "a";
        
        while(balls.length() <= n){
            if(flg.equals("a")){
                for(int i=0; i<a; i++){
                    balls += "a";
                }
                flg = "b";
            }
            else{
                for(int i=0; i<b; i++){
                    balls += "b";
                }
                flg = "a";
            }
        }
        
        balls = balls.substring(0, n+1);
        
        int ans = 0;
        for(int i=0; i<n; i++){
            if(balls.charAt(i) == 'a'){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}