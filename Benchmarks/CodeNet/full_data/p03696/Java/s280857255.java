import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        String s1 = sc.next();
        String s2 = s1;
        s1 += "AAA";
        char[] c1 = new char[101];
        c1 = s1.toCharArray();
        
        int r = 0;
        int l = 0;
        
        int f = 0;
        
        for(int sa = 0; sa<s1.length();sa++){
     
            if(c1[sa]==')') r++;
            if(c1[sa]=='(') l++;
     
            
        }
        String R ="";
        String L ="";
        
        if(r!=l){
           for(int sa = 0; sa<r-l;sa++)  R += "(";
           for(int sa = 0; sa<l-r;sa++)  L += ")";
        }
        else {
              for(int sa = 0; sa<r;sa++)  R += "(";
           for(int sa = 0; sa<l;sa++)  L += ")";
            
            
        }
        

        //System.out.println(r);
        //System.out.println(l);
        //System.out.println(R);
        //System.out.println(L);
        System.out.print(R+s2+L);
        
        

        System.out.println();
    }

}