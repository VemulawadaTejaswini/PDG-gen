import java.util.*;

class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int arr[ ] = new int[N];
    for(int i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
    
    int [ ] c =new int[N];
    for(int i=0;i<c.length-1;i++)
    {
      if(arr[i+1]<=arr[i])
        c[i]=1;
      else c[i]=0;
    }
    int sum=0;
 	int max =Integer.MIN_VALUE;
    for(int i=0;i<c.length;i++)
    {
     	if(c[i]==0 || i == c.length-1)
        {
          if(sum>max) { max=sum; } 
          sum=0;
        }
      else
      {
        sum++;
      }
    }
    
    System.out.println(max);
  }
  
}