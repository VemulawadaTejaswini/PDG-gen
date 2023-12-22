
import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);     
        String s1=sc.next();
        String s2=sc.next();
        long a1=sc.nextLong();
        long a2=sc.nextLong();
        String s3=sc.next();
        if(s3.equals(s1))
        {
        	a1=a1-1;
        	System.out.println(a1);
        	System.out.println(a2);
        	
        }
        else
        {

        	a2=a2-1;
        	System.out.println(a1);
        	System.out.println(a2);
        


        }
        sc.close();
       



        }
    
}