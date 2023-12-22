/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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
    ans[1] = arr[1] - arr[0];
  for(int i = 2;i<k;i++)
    ans[i] = arr[i]- arr[0];
    for(int i = k; i<n;i++)
    {
      for(int j = 1; j<k;j++)
        if(i-j>=0)
        ans[i] = Integer.min( ( ans[i-j] + Math.abs(arr[i] - arr[i-j]) ),ans[i]);
    }
  System.out.println(ans[n-1]);
}
}