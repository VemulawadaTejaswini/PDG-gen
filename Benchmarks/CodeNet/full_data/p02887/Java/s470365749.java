import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in1 = new Scanner(System.in);
        int N=in1.nextInt();
        Scanner s = new Scanner(System.in);
        String S=s.nextLine();
        int y=1;
        char f=S.charAt(0);
        for (int x=1;x<S.length();++x)
        {
            if (S.charAt(x)!=f)
            {
                f=S.charAt(x);
                ++y;
            }
        }
        System.out.print(y);
    }
}