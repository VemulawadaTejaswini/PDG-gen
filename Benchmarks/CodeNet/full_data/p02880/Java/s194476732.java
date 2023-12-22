import java.util.Scanner;

public class Main {

    public String multiple(int a)
    {
        for(int i = 1; i <= 9; i++)
        {
            float divisor = (float) a / (float) i;
            if(divisor == Math.round(divisor) && divisor >= 1 && divisor <= 9)
            {
                return "Yes";
            }
        }

        return "No";

    }

    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        a = sc.nextInt();
        System.out.print(m.multiple(a));
    }
}