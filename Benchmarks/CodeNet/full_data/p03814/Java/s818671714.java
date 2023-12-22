import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();
        
        int i,j=str.length();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A')
            {
                break;
            }
        }
        
        while(j>0)
        {
            if(str.charAt(j-1)=='Z')
            {
                break;
            }
            j--;
        }
        
        System.out.println(j-i);
    }
}