import java.util.*;
import java.math.*;

class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();    
        String s = in.next();
        int k = in.nextInt();
        
        char key = s.charAt(k-1);
        for (int i = 0; i < n; ++i){
            char x = s.charAt(i);
            if (x != key)  System.out.print('*');
                else System.out.print(x);
        }
        
    }
}
