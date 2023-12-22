import java.util.Scanner;

public class Main
{
    public static int f(int[] arr)
    {
        int sum =0;
        int even =arr[0];
        int odd = arr[1];
        for(int i=0; i<arr[0];i++)
        {
            even = even-1;
            sum = sum + even;
            
        }
        for(int i=0; i<arr[1]; i++)
        {
            odd = odd-1;
            sum = sum + odd;
            
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[2];
        for(int i=0; i<2 ;i++)
        {
            arr[i] = keyboard.nextInt();
        }
        int pairs = 0;
        pairs = f(arr);
        System.out.println(pairs);
    }
}

