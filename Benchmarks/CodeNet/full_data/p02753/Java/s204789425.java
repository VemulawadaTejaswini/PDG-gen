import java.util.Scanner;
class abc
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    for(int i=0;i<s.length()-1;i++)
    {
		if(s.charAt(i)!=s.charAt(i+1))
        {
          System.out.println("Yes");
            return;
        }
    }
    System.out.println("No");
  }
}