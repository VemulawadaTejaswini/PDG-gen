import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    String a=input.next();
    int length=a.length();
    if(length>=2 && length<=26)
    {
      int list[]=new int[length];
      int form=0;
      for(int i=0;i<length;i++)
      {
        int b=a.codePointAt(i);
        if(b>=97 && b<=122)
        {
          if(i==0)
          {
            list[0]=b;
          }
          for(int k=0;k<i;k++)
          {
            if(list[k]==b)
            {
             form=1; 
             break;
            }else
            {
              list[k]=b;
            }
          }
        }else
        {
        form=3;
        break;
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