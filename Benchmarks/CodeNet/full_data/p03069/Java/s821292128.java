import java.util.*;
import java.math.*;

class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        String s = in.next();
        
        int doc = 0;
        for (int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '.') ++doc;
        }
        int ans = doc;
        
        for (int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '#') ++doc;
            if (s.charAt(i) == '.') --doc;
            ans = Math.min(ans,doc);
        }
        
        System.out.print(ans);
    }
}
