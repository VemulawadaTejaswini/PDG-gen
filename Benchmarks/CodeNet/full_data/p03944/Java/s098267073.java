import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int max_x = sc.nextInt();
        int max_y = sc.nextInt();
        int min_x = 0;
        int min_y = 0;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int t = sc.nextInt();

            if(t == 1)
                min_x = Math.max(x, min_x);
            else if(t == 2)
                max_x = Math.min(x, max_x);
            else if(t == 3)
                min_y = Math.max(y, min_y);
            else if(t == 4)
                max_y = Math.min(y, max_y);
        }

        System.out.println(Math.max(0, (max_x - min_x) * (max_y - min_y)));
    }
}
