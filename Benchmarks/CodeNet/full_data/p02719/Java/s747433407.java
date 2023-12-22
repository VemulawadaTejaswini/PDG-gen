import java.util.*;
class Main{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int min=1000000;
  int j;
  if(n>k)
    j=n;
  else
    j=k;
  for(int i=0;i<j;i++)
  {
    if(Math.abs(n-k)<min)
      min=Math.abs(n-k);
    n=Math.abs(n-k);
  }
  System.out.println(Math.abs(min));
}
}