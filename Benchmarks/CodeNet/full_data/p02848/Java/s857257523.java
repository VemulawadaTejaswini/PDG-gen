import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    String s;
    n=sc.nextInt();
    sc.nextLine();
    s=sc.nextLine();
    char a[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
      a[i]=(char)((((a[i]-'A')+n)%26)+65);
    }
    String s1=new String(a);
    System.out.println(s1);
  }
}