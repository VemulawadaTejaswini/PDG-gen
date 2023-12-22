import java.util.*;
public class Main
{
    public static void main(String[] args)
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    long sum=0;
    long a=0;
    for(int i=0;i<(2*n);i=i+2)
    {
        sum=sum+Sc.nextLong();
        long h=Sc.nextLong();
        if(h>a)
        a=h;
    }
    if(sum<=a)
    System.out.println("Yes");
    else
    System.out.println("No");
      
  }
}
