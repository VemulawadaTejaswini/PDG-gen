import java.util.*;
import java.math.*;

class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();    
        String s = in.next();
        
        int ans = 0;
        
        for (int i = 1; i < n - 1; ++i){
            if (s.charAt(i) == '#') continue;
                else
                    if (s.charAt(i) == '.' && s.charAt(i-1) == '#' && s.charAt(i+1) == '.')
                        ++ans;
                else
                    if (s.charAt(i) == '.' && s.charAt(i-1) == '#' && s.charAt(i+1) == '#')
                        ++ans;            
            }
        if (s.charAt(s.length() - 1) == '.' && s.charAt(s.length() - 2)== '#') ++ans;
        if (s.charAt(0) == '#' && s.charAt(1)== '#') ++ans;
        System.out.print(ans);
    }
}
