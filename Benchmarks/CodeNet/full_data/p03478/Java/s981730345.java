import java.util.Scanner;
import java.lang.Math;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int a=input.nextInt();
    int b=input.nextInt();
    int counter=0;
    for(int i=1;i<=n;i++)
    {
      String c=""+i;
      int count=0;
      for(int k=0;k<c.length();k++)
      {
        char d=c.charAt(k);
        count=count+Integer.parseInt(""+d);
      }
      if(count>=a && count<=b)
      {
        counter=counter+i;
      }
    }
    System.out.println(counter);
  }
}