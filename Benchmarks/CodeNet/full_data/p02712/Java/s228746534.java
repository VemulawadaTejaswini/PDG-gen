import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sumatoria=0;
        for(int i=0;i<=n;i++)
        {
          if((i%3!=0)&&(i%5!=0))
          sumatoria = sumatoria+i;
         }
        System.out.print(sumatoria);
    }
}