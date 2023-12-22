import java.io.*;
import java.util.*;
import java.util.Collection;
class Main
{
  public static void main(String args[])  throws java.lang.Exception
  {
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
    String s=br.readLine();
    int count=0;
    for(int i=0;i<s.length()-3;i++)
     {
       for(int j=i+3;j<=s.length();j++)
         {
           String ch=s.substring(i,j);
           long num=Long.parseLong(ch);
           if(num>0 && num%2019==0)
            {
              count++;
            }
         }
     }
    System.out.println(count);
   
   }
}  
