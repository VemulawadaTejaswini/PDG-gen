import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int arr[][]= new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        long res[][] =new long[n+1][w+1];
        for(int i=0;i<=n;i++)
        {
            res[i][0]=0;
        }
        for(int i=0;i<=w;i++)
        {
            res[0][i]=0;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(j<arr[i-1][0])
                {
                    res[i][j] = res[i-1][j];
                }   
                else
                {
                    res[i][j]= Math.max(res[i-1][j],arr[i-1][1]+res[i-1][j-arr[i-1][0]]);
                }
            }
        }
        System.out.println(res[n][w]);
    }
}