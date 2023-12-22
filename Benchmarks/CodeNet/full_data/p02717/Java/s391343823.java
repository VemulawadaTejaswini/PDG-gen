import java.util.*;
class Solution
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int temp;
  temp=b;
  b=a;
  a=temp;
  temp=c;
  c=a;
  a=temp;
  System.out.println(a+" "+b+" "+c);
}
}
