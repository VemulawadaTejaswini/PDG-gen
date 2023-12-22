import java.util.*;
class solution
{
    public static void main(String args[])
    {
        try{
            Scanner s1=new Scanner(System.in);
            String n=s1.next();
            String s=n.substring(0,4);
            if(s.equals("YAKI"))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        catch(Exception e)
        {
            
        }
    }
}