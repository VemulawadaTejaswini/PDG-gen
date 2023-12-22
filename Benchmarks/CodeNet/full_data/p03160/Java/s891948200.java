import java.util.*;
class frog
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int[n];
  int[] ans = new int[n];
  ans[0] = arr[0];
  ans[1] = arr[1] - arr[0];
  for(int i = 2;i<n;i++)
  {
  ans[i] = Integer.min(arr[i] - ans[i-1],arr[i] - ans[i-2]);
  }
  System.out.println(ans[n-1]);
	}
}