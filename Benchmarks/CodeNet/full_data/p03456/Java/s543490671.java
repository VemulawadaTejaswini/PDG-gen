import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String c=a+b;
    int k=Integer.parseInt(c);
    int count=0;
    for(int i=1;i<=Math.sqrt(k);i++)
    {
      if(i*i==k)
      {
        System.out.println("Yes");
        count=1;
        break;
      }
      else count++;
    }
    if(count>1) System.out.println("No");
  } 
}