import java.util.*;
public class Main{
  static boolean palin(String s)
  {char c[]=s.toCharArray();
   int n=c.length;
   for(int i=0;i<n;i++)
   {
     if(c[i]!=c[n-1-i])
       return false;
   }
   return true;
  }
 public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     String s=sc.next();
    int n=s.length();
     boolean palindrome=palin(s);
    if(n%2==1)
    {
     if(palindrome==true)
     { String x=s.substring(0,(n-1)/2);
       String y=s.substring(((n+3)/2)-1,n);
       if(palin(x) && palin(y))
         System.out.println("Yes");
     }
    }
    else
      System.out.println("No");
   }
}
