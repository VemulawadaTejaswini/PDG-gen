import java.util.*;

class BBQ
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int [] arr = new int[n];
    
    for(int i = 0;i < n; i++)
      arr[i] = s.nextInt();
    
    Arrays.sort(arr);
    
    int count = 0;
    for(int i = 0; i < n; i +=2)
      count += arr[i];
    
    System.out.println(count);
  }
}