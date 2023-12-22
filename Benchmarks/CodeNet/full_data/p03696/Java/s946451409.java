import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        String s1 = sc.next();
        char[] c1 = s1.toCharArray();
        
        int r = 0;
        int l = 0;
        
        for(int sa = 0; sa<s1.length();sa++){
            if(c1[sa]==')') r++;
            if(c1[sa]=='(') l++;
        }
        String R ="";
        String L ="";
           for(int sa = 0; sa<r;sa++)  R += "(";
           for(int sa = 0; sa<l;sa++)  L += ")";
        
        System.out.print(R+s1+L);
        
        

        System.out.println();
    }

}