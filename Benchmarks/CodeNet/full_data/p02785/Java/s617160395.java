import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);
      int h = s.nextInt();
      int k = s.nextInt();
      
      Integer a[] = new Integer[h];
      int sum=0;
      for(int i = 0; i <= h ;i++)
        {
            a[i] = s.nextInt();
        }
      Arrays.sort(a, Collections.reverseOrder()); 
      
      for(int j = k; j<(h-k); j++ )
      {
        sum = sum + a[j];
      }
      System.out.println("" + sum);
    }
      
   
}