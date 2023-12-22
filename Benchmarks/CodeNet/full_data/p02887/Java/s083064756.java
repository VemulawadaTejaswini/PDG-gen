import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in1 = new Scanner(System.in);
        int N=in1.nextInt();
        Scanner s = new Scanner(System.in);
        String S=s.nextLine();
        int y=0;
        for (int x=0;x<S.length()-1;++x)
        {
            if (S.charAt(x)==S.charAt(x+1))
            {
                while (S.charAt(x)==S.charAt(x+1)&&x<S.length()-2)
                {
                    ++x;
                }
                ++y;
            }
        }
        System.out.print(y);
    }
}