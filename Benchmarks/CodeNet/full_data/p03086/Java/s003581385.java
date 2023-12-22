import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();

        int ans = 0;
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'A' || S.charAt(i) == 'T' || S.charAt(i) == 'G' || S.charAt(i) == 'C'){
                count++;
            }else{
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        System.out.println(ans);
    }
}
