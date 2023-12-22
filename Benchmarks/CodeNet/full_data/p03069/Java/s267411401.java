import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc =new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        int len = S.length();
        int wCount = 0;
        int ans = 0;
        
        //左端の連続する白石の数をカウント
        for(int i = 0; i < len; i++){
            if(S.charAt(i) == '.'){
                wCount++;
            }else{
                break;
            }
        }

        //左端に初めて出現する黒石から最右端までの白石と黒石の数をそれぞれカウント        
        int b = 0;
        int w = 0;
        for(int i = wCount; i < len; i++){
            if(S.substring(i,i+1).equals("#")){
                b++;    
            }else{
                w++;
            }
        }
        //白石と黒石の最小数を算出
        ans = Math.min(b,w);
        
        System.out.println(ans);
    }
}
