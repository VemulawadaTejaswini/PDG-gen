import java.util.*;
public class Main
{
    public static void main(String[] args)
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    long sum=0;
        TreeSet<Long> set = new TreeSet<Long>(); 
    for(int i=0;i<(n);i++)
    {
        sum=sum+Sc.nextLong();
        set.add(Sc.nextLong());
    }
    if(sum<=set.last())
    System.out.println("Yes");
    else
    System.out.println("No");
      
  }
}
