import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        String T = sc.next();
        
        int[] henkan = new int[26];
        int[] rhenkan = new int[26];
        Arrays.fill(henkan, -1);
        Arrays.fill(rhenkan, -1);        
        
        boolean isOK = true;
        for(int i = 0; i < S.length(); i++){
            
            char s = S.charAt(i);
            char t = T.charAt(i);
            
            if( henkan[s-'a'] == -1 && rhenkan[t-'a'] == -1 ){
                henkan[s-'a'] = t-'a';
                rhenkan[t-'a'] = s-'a';
            } else {
                if( henkan[s-'a'] != t-'a' || rhenkan[t-'a'] != s-'a' ){
                    isOK = false;
                    break;
                }
            }
        }
        
        System.out.println( isOK ? "Yes" : "No" );
        
    }

}
