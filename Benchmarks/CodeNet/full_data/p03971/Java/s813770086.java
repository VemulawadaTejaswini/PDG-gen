
import java.util.Scanner;

public class Main
{
    private final static Main main = new Main();

    public static void main(String[] args)
    {
        long l = System.currentTimeMillis();
        main.contest();
        //System.out.println("処理時間：" + (System.currentTimeMillis() - l));
    }

    private void contest()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        char[] cs = sc.nextLine().toCharArray();
        int _a = 0;
        int _b = 0;
        for(char c : cs)
        {
            switch(c)
            {
                case 'a':
                {
                    if(a+b > _a+_b)
                    {
                        ++_a;
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                    break;
                }
                case 'b':
                {
                    if(a+b > _a+_b && b > _b)
                    {
                        ++_b;
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                    break;
                }
                default:
                {
                    System.out.println("No");
                }
            }
        }
    }
}
