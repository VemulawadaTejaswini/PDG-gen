import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y=1;
        int sumatoria=0;
        while(y<=n)
        {
          if((y%3==0)||(y%5==0))
          sumatoria = sumatoria;
          else
          sumatoria = sumatoria+y;
          y++;
        }
        System.out.print(sumatoria);
    }
}