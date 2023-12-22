import java.util.*;
class gold
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=0;
    for(int i=500;i<=n;i+=500)
    {
      x=x+1000;
    }
    n=n%500;
    if(n!=0)
    {
      for(int i=5;i<=n;i++)
      {
        x=x+5;
      }
    }
    System.out.println(x);
  }
}

    