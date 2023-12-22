import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String o = scan.next();
        String e = scan.next();
        
        for(int i=0;i<e.length();i++)
        {
            System.out.print(o.charAt(i));
            System.out.print(e.charAt(i));
        }
        if(o.length()>e.length())
        {
            System.out.println(o.charAt(o.length()-1));
        }
        else
        {
            System.out.println();
        }
    }
}