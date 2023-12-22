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
    sc.nextLine();
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
 /* private void selsort()
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
  }*/
  int partition(int low, int high) 
  { 
        int pivot = ct[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        {
            if (ct[j] > pivot) 
            { 
                i++; 
  
                // swap 
                int temp = ct[i]; 
                ct[i] = ct[j]; 
                ct[j] = temp;
                String t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            } 
        }
        String temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp;
        int t=ct[i+1];
        ct[i+1]=ct[high];
        ct[high]=t;
        return i+1; 
  }
  void sort(int low, int high) 
  { 
        if (low < high) 
        {
            int pi = partition(low, high); 
            sort(low, pi-1); 
            sort(pi+1, high); 
        } 
  }
  private void disp()
  {
    readinp();
    sort(0,k-1);
    //printar(k,true);
    int l=0;
    while(l<k&&ct[l]==ct[0])l++;
    int mx;
    String st;
    for(int i=0;i<l-1;i++)
    {
      mx=i;
      for(int j=i+1;j<l;j++)
      {
        if(arr[i].compareTo(arr[j])>0)
          mx=j;
      }
      if(mx!=i)
      {
        st=arr[i];
        arr[i]=arr[mx];
        arr[mx]=st;
      }
    }
   // printar(l,false);
    for(int i=0;i<l;i++)
        System.out.println(arr[i]);
  }
 /* private void printar(int l,boolean f)
  {
      System.out.println("Array:\n");
      for(int i=0;i<l;i++)
      {
          System.out.println(arr[i]+"\t"+(f?ct[i]:""));
      }
      System.out.println("End\n\n");
  }*/
  public static void main(String[] args)
  {
    Main ob=new Main();
    ob.disp();
  }
}