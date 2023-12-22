import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    int l=S.length();
    int Q=sc.nextInt();
    
    for(int i=0;i<Q;i++)
    {
      int T=sc.nextInt();
      if(T==1)
      {String str="";
        for(int j=l-1;j>=0;j--)
        {
          str=str+S.charAt(j);
          
        }
        S=str;
      }
      if(T==2)
      {
        int F=sc.nextInt();
        String C=sc.next();
        if(F==1)
        {
          S=C+S;
        }
        else
        {
          S=S+C;
        }
        l++;
      }
    }
    System.out.println(S);
  }
}