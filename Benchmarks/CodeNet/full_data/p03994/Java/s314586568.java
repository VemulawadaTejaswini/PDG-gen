
import java.util.*;

public class Main
{
    private final static Main main = new Main();

    public static void main(String[] args)
    {
        main.contest();
    }

    private void contest()
    {
        Scanner sc = new Scanner(System.in);
        char[] as = sc.nextLine().toCharArray();
        int k = sc.nextInt();
        int n = as.length;

        // まずaにできるやつはaにする
        for(int i=0; i<n; ++i)
        {
            // もともとaのものは無視
            if(as[i] == 'a')
            {
                continue;
            }
            // aにするために必要な操作数
            int action = 'z' - as[i] + 1;
            if(k < action)
            {
                // 残りの操作可能数より多い
                continue;
            }
            k -= action;
            as[i] = 'a';
        }
        char c = (char) (as[n-1] + (k%26));
        as[n-1] = c > 'z' ? (char) ('a' + c-'z') : c;
        System.out.println(as);
    }
}
