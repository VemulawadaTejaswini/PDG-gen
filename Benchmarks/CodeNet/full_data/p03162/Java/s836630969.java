import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[][]= new long[n][3];
        // long res[][] = new long[n][3]; 
        for(int i =0;i<n;i++)
        {
            arr[i][0]=(long)(sc.nextInt());
            arr[i][1]=(long)(sc.nextInt());
            arr[i][2]=(long)(sc.nextInt());
        }
        long max = Long.MIN_VALUE;
        for(int j=1;j<n;j++)
        {
            arr[j][0] += Math.max(arr[j-1][1],arr[j-1][2]);
            arr[j][1] +=Math.max(arr[j-1][0],arr[j-1][2]);
            arr[j][2] +=Math.max(arr[j-1][1],arr[j-1][0]);
        }
        for(int i=0;i<3;i++)
        {
            max = Math.max(max,arr[n-1][i]);
        }
        System.out.println(max);

    }
}