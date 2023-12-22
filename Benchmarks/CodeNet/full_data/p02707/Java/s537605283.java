import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n-1;i++)
      list.add(Sc.nextInt());
    for(int i=1;i<=n;i++)
      System.out.println(Collections.frequency(list,i));
  }
}
