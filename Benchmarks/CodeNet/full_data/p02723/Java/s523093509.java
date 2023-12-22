import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int min=arr[0];int max=arr[0];
    for(int i=0;i<n;i++)
    {
      if(arr[i]<min)
        min=arr[i];
      if(arr[i]>max)
        max=arr[i];
    }
    int x=max-min;
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=max){
        if((max-arr[i])<x)
        x=max-arr[i];}
    }
    System.out.println(x);
  }
}
