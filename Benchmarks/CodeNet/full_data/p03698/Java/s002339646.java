import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    String a=input.next();
    int length=a.length();
    if(length>=2 && length<=26)
    {
      ArrayList<Integer> list=new ArrayList<Integer>();
      int form=0;
      for(int i=0;i<length;i++)
      {
        int b=a.codePointAt(i);
        if(b>=97 && b<=122)
        {
          if(i==0)
          {
            list.add(b);
          }
          for(int k=0;k<i;k++)
          {
            if(list.get(k)==b)
            {
             form=1; 
             break;
            }else
            {
              list.add(b);
            }
          }
        }
      }
      if(form==0)
      {
        System.out.println("yes");
      }else
      if(form==1)
      {
        System.out.println("no");
      }
    }
  }
}