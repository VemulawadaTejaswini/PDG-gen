import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public
class Main
{
    public static
    void main(String[] args)
    {
        new Main().run();
    }

    private
    void run()
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int left = max(c, a);
        int right = min(b, d);

        System.out.println(right - left > 0 ? right - left : 0);
    }
}
