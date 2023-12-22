import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    
    String s = scan.next();
    String t = scan.next();
    
    if(s.length()>t.length())
    {
        System.out.println("GREATER");
        return;
    }
    else if(s.length()<t.length())
    {
        System.out.println("LESS");
        return;
    }
    
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)>t.charAt(i))
        {
            System.out.println("GREATER");
            return;
        }
        else if(s.charAt(i)<t.charAt(i))
        {
            System.out.println("LESS");
            return;
        }
    }
    System.out.println("EQUAL");
    }
}