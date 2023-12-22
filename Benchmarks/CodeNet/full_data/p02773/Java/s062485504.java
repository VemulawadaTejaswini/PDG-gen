import java.util.*;
public class Main
{
  String arr[];
  int ct[];
  int k;
  private int ispres(String s)
  {
    for(int i=0;i<k;i++)
      if(s.equals(arr[i]))
        return i;
    return -1;
  }
  private void readinp()
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),tem=0;
    arr=new String[n];
    ct=new int[n];
    k=0;
    String t;
    for(int i=0;i<n;i++)
    {
      t=sc.nextLine();
      if((tem=ispres(t))>-1)
        ct[tem]++;
      else
      {
        arr[k]=t;
        ct[k++]++;
      }
    }
  }
  private void selsort()
  {
    readinp();
    int mx,intt;
    String st;
    for(int i=0;i<k-1;i++)
    {
      mx=i;
      for(int j=i+1;j<k;j++)
      {
        if(ct[j]>ct[mx])
          mx=j;
      }
      if(mx!=i)
      {
        intt=ct[i];
        ct[i]=ct[mx];
        ct[mx]=intt;
        st=arr[i];
        arr[i]=arr[mx];
        arr[mx]=st;
      }
    }
  }
  private void disp()
  {
    selsort();
    int i=0;
    while(i<k&&ct[i]==ct[0])
    {
      System.out.println(arr[i]);
      i++;
    }
  }
  public static void main(String[] args)
  {
    Main ob=new Main();
    ob.disp();
  }
}