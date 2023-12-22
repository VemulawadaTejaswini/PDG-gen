import java.util.*;
class Main
{
  public static void main(String[] args)
    
  {
    Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    
   
    
    String s1="sunny",s2="cloudy",s3="rainy";
    if(s.equals(s1))
    {
    	System.out.println(s2);
    }
    else if(s.equals(s2))
    {
    	System.out.println(s3);
    }
    else
    {
      System.out.println(s1);
    }
  }
}