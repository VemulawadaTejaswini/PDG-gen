import java.util.*;
public class Main{
    int arr[][];
    int n;
    private void enter()
    {
        //System.out.print("Enter the size: ");
        Scanner sc=new Scanner(System.in);
        arr=new int[n=sc.nextInt()][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
                arr[i][j]=sc.nextInt();
        }
    }
    private void solve()
    {
        enter();
        for(int i=n-2;i>=0;i--)
        {
            arr[i][0]+=arr[i+1][1]>arr[i+1][2]?arr[i+1][1]:arr[i+1][2];
            arr[i][1]+=arr[i+1][0]>arr[i+1][2]?arr[i+1][0]:arr[i+1][2];
            arr[i][2]+=arr[i+1][1]>arr[i+1][0]?arr[i+1][1]:arr[i+1][0];
        }
    }
    private void finans()
    {
        solve();
        System.out.println(arr[0][0]>arr[0][1]?arr[0][0]>arr[0][2]?arr[0][0]:arr[0][2]:arr[0][1]>arr[0][2]?arr[0][1]:arr[0][2]);
    }
    public static void main(String args[]) {
      Main ob=new Main();
      ob.finans();
    }
}