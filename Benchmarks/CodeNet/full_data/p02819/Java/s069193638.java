import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean arr[]=new boolean[100004];
        for(int i=2;i*i<100004;i++)
        {
            for(int j=i*i;j<100004;j+=i)
            arr[j]=true;
        }
        int n=sc.nextInt();
        for(int i=n;i<arr.length;i++)
        {
            if(!arr[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
}