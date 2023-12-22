//package Contest090;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int first = sc.nextInt(),last = sc.nextInt();
        int cnt =0;
        for(int i = first;i<=last;i++)
        {
            String str1 = String.valueOf(i);
            StringBuilder sb = new StringBuilder(str1);
            sb = sb.reverse();
            String temp = sb.toString();
            //out.println(str1+" "+temp);
            if(str1.equals(temp))
                cnt++;

        }
        out.println(cnt);

        out.flush();
    }

}
