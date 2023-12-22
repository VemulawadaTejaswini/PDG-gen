import java.util.*;
class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int A[] = new int[n];
    for(int i = 0;i<n;i++)
      A[i] = in.nextInt();
     int sum = 0;
    int secondlarge = 0; int large =0;
    for(int i = 0;i<=n-1;i++)
    {
      int val1 = A[i]; large = val1; secondlarge = 0;
     	for(int j = i+1;j<=n-1;j++)
        {
          int val = A[j];
          if(val>secondlarge)
          {
            if(val>large)
            {
              secondlarge = large;
              large = val;
            }
            else
            {
              secondlarge = val;
            }
          }
          sum += secondlarge;
        }
        
    }
    // sum += B[n-1];
     System.out.println(sum);
  }
}