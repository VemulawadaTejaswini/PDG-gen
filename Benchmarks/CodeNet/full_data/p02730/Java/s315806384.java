import java.util.*;
public class Main
{
public static void main(String[] args)
    { 
       Scanner s=new Scanner(System.in);
       String st=s.next();
       int n=st.length();
       char ch[]=st.toCharArray();
       boolean b=true;
        Palindrome p1=new Palindrome();
      int k=(n-1)/2;
       char ch1[]=new char[k];
       char ch2[]=new char[k];
       for(int i=0;i<k;i++)
        { 
          ch1[i]=ch[i];
          ch2[i]=ch[k+i+1];
         }
    String st1=new String(ch1);
    String st2=new String(ch2);
      if(p1.checkPalindrome(st)^p1.checkPalindrome(st1)^p1.checkPalindrome(st2))
       System.out.println("Yes");
       else
       System.out.println("No");
           
       
   
}
}
class Palindrome 
 
{ 
  public static boolean checkPalindrome(String s) 
  { 
    // reverse the given String 
    String reverse = new StringBuffer(s).reverse().toString(); 
  
    // check whether the string is palindrome or not 
    if (s.equals(reverse)) 
      return true;
  
    else
      return false;
  }
}