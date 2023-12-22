import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int m = key.nextInt();
        int arr[] = new int[n];
        int sum =0;
        for(int i = 0; i<n;i++)
        {
            arr[i] = key.nextInt();
            sum = sum + arr[i];
        }
        sum = sum/(m*4);
        System.out.println(sum);
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] >= sum)
            {
                count ++;
            }
        }
        if(count >= m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

