import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
   int a[]=new int[n];
    int b[]=new int[n];
   
    for(int i=0;i<n;i++)
     {
      a[i]=s.nextInt();
      
     }
b[0]=a[0];
for(int i=1;i<n;i++)
{
b[i]+=a[i]+b[i-1];
}
float max=a[k-1];

  for(int i=k;i<n;i++)
   {

     
      if(b[i]-b[i-k]>max)
       max=b[i]-b[i-k];
    }
System.out.println((float)((max+k)/2));
   
   



}
}

