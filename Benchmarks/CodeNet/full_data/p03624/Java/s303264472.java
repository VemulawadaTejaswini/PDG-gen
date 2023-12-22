import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        
        char a = 'a';
        
        for(int i=0;i<26;i++)
        {
            if(Have(s,a)==0)
            {
                System.out.println(a);
                return;
            }
            else
            {
                a++;
            }
        }
        System.out.println("None");
    }
    
    static int Have(String s,char a){
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)==a)
            {
                return 1;
            }
            else
            {
                i++;
            }
        }
        return 0;
    }
}