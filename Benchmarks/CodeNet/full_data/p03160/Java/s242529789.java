import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int res[] =new int[n];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[0]=0;
        for(int i=1;i<n;i++)
        {
            // int one =Integer.MAX_VALUE;
            // int two =Integer.MAX_VALUE;
            if(i-1>=0)
            {
                res[i] = Math.min(Math.abs(arr[i]-arr[i-1])+res[i-1],res[i]);
            }
            if(i-2>=0)
            {
                res[i] = Math.min(Math.abs(arr[i]-arr[i-2])+res[i-2],res[i]);
            }
        }
        System.out.println(res[n-1]);
    }
}