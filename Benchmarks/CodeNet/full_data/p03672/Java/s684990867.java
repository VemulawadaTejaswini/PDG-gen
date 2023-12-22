import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        int l = s.length()-1;
        
        while(l>0)
        {
            if(CheckOString(s,l)==1)
            {
                System.out.println(l);
                return;
            }
            l--;
        }
        System.out.println("Error");
    }
    
    static int CheckOString(String s,int l){
        if(l%2==1)
        {
            return 0;
        }
        for(int i=0;i<l/2;i++)
        {    
            if(s.charAt(i)!=s.charAt(l/2+i))
            {
                return 0;
            }
        }
        return 1;
    }
}