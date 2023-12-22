import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int Q = sc.nextInt();
        StringBuffer sb = new StringBuffer(A);

        for (int i = 0; i < Q; i++)
        {
            int t = sc.nextInt();
            if (t == 1)
            {
                sb.reverse();
            }
            else if (t == 2)
            {
                int f = sc.nextInt();
                String c = sc.next();
                if (f == 1)
                {
                    sb.insert(0, c);
                }
                else if (f == 2)
                {
                    sb.append(c);
                }
            }
        }
        System.out.print(sb.toString());
    }
}
