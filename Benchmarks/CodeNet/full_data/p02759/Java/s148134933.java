import java.util.Scanner
class A
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  while(N>0 && N<101)
  {
    if(N%2==0)
    {
      System.out.println(N/2);
      break;
    }
    else
    {
      System.out.println((N/2)+1);
      break;
    }
  }
}   
}