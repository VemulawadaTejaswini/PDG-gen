import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int[n];
  int[] ans = new int[n];
  int k = sc.nextInt();
  for(int i = 0; i<n;i++)
  {arr[i] = sc.nextInt();
  ans[i] = Integer.MAX_VALUE;
  }
  ans[0] = 0;
  ans[1] = arr[1];
  for(int i = 2;i<k;i++)
    ans[i] = arr[i]
    for(int i = k; i<n;i++)
    {
      for(int j = 0 ; j<k;j++)
        ans[i] = Integer.min(ans[i-j] + Math.abs(arr[i] - arr[i-j]),ans[i]);
    }
  System.out.println(ans[n-1]);
}
}