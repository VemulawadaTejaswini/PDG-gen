import java.util.*;
import java.io.*;
public class abc
{
  public static void main(String args[])throws Exception
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int flag=0;
    for(int i=0;i<s.length()-1;i++)
    {
      if(s.charAt(i)==s.charAt(i+1))
      {
        flag=1;
        break;
      }
    }
    if(flag==1)
      System.out.println("Bad");
    else
      System.out.println("Good");
  }
}