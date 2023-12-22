import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp;
        int kis=0;
        for(int i = 0;i<N;i++)
        {
            temp = sc.nextInt();
            temp = temp%2;
            if(temp != 0)
            {
                kis++;
            }
        }
        kis = kis%2;
        if(kis!=0)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}