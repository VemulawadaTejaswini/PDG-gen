import java.util.*;
public class Main {
public static void main(String args[])
{
  Scanner sp=new Scanner(System.in);
    int n=sp.nextInt();
    int ar[]=new int[n];
    int sc=0;
    int sn=0;
    int pre=0;
    for(int i=0;i<n;i++)
    {
      ar[i]=sp.nextInt();
    }
    for(int i=0;i<n;i++)    
    {
      
       if(pre==ar[i])
          {
              pre=ar[i];
          }
      if(pre<ar[i])
      {
          
        ar[i]-=1;
        pre=ar[i];

      }
      else{
        
        pre=ar[i];
        
      }
    }
    
    pre=0;

    
      for(int i=0;i<n;i++)
    {
      if(pre<=ar[i])
      {
        pre=ar[i];
      }
      else{
        sc++;
      }
    }
    if(sc>0)
    {
System.out.print("No");
    }
    else{
    System.out.print("Yes");
    }

}
}
