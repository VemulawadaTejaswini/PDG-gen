import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ss = br.readLine().split("\\s");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(ss[i]);
        }
        int res = 0, k = n;
        int p = 0, q = n-1;
        while(k >= 3)
        {
            if(arr[p] + arr[p+1] > arr[q] + arr[q-1])
            {
                res = res + (arr[q] + arr[q-1]);
                arr[q-1] = arr[q] + arr[q-1];
                n = n-1;
                q = q-1;
                k = k-1;
            }
            else
            {
                res = res + arr[p] + arr[p+1];
                arr[p+1] = arr[p] + arr[p+1];
                p = p + 1;
                k = k - 1;
            }
        }
        System.out.println(res + arr[p] + arr[q]);
    }
}