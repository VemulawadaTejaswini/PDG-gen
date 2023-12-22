import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int c=Sc.nextInt();
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      list.add(Sc.nextInt());
      list2.add(Sc.nextInt());
    }
    int cans=0;int cost=0;
    while(cans<c)
    {
      int cr=c-cans;
      int a=Collections.min(list);
      int in=list.indexOf(a);
      int ca=list2.get(in);
      if(ca<cr)
      {cans=cans+ca;cost=cost+(a*ca);}
      else
      {cans=cans+cr;cost=cost+(a*cr);}
      list.remove(in);
      list2.remove(in);
    }
    System.out.println(cost);
  }
}