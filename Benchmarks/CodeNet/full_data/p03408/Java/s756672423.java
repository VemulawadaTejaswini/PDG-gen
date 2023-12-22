import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String[] s = new String[n];
        for(int i=0;i<s.length;i++)
        {
            s[i] = scan.next();
        }
        
        int m = scan.nextInt();
        String[] t = new String[m];
        for(int i=0;i<t.length;i++)
        {
            t[i] = scan.next();
        }
        
        int max = 0;
        for(int i=0;i<s.length;i++)
        {
            int tmp = 0;
            for(int j=0;j<s.length;j++)
            {
                if(CheckSame(s[i],s[j]))
                {
                    tmp++;
                }
            }
            for(int j=0;j<t.length;j++)
            {
                if(CheckSame(s[i],t[j]))
                {
                    tmp--;
                }
            }
            if(tmp>max)
            {
                max = tmp;
            }
        }
        
        System.out.println(max);
    }
    
    
    static Boolean CheckSame(String a,String b){
        if(a.length() != b.length())
        {
            return false;
        }
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) != b.charAt(i))
            {
                return false;
            }
        }
        return true;
    } 
}