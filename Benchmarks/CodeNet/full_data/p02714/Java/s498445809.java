

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Main m = new Main();
        m.p4();
    }

    public void p4()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String input = scan.nextLine();
        char[] c = input.toCharArray();
        int ans = 0;
//        int[] c_int = new int[c.length];
//        for(int i = 0; i < c.length; i++)
//        {
//            if(c[i]=='R')c_int[i] = 1;
//            else if(c[i]=='G')c_int[i] = 34;
//            else if(c[i]=='B')c_int[i] = 45;
//        }
        for(int i = 0; i < c.length; i++)
        {
            for(int j = i+1; j < c.length; j++)
            {
                for(int k = j+1; k < c.length; k++)
                {
                    if(j - i == k - j)continue;
                    if((c[i] + c[j] + c[k])== 'R'+'G'+'B')ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
