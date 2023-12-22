import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long count =0 ;
    if( a == b)
    {
        if( (a%c)==0 && (a%d)==0 )
            System.out.println(0);
        else 
            System.out.println(1);
    }
    else
    {
        long a1 = a/c;
        long a11 = a%c;
        if( a11 != 0)
            a1++;
        long a2 = b/c;
        count = a2-a1+1;
        
        long b1=a/d;
        long b11 = a%d;
        if( b11 != 0)
            b1++;
        long b2 =b/d;
        count = count+(b2-b1+1);
        
        long gcdnum = gcd(c , d);
        long lcm = (c*d)/gcdnum;
        long c1 = a/lcm;
        if(a % lcm == 0)
            c1--;
        long c2 = b/lcm;
        count = count-(c2-c1);
        // System.out.println("a1="+a1+" a2="+a2+" b1="+b1+" b2="+b2+" c1="+c1+" c2="+c2);
        // System.out.println(count);
        System.out.println((b-a+1)-count);
    }
    
    
  }
  
    
    static long gcd(long a, long b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
      
}